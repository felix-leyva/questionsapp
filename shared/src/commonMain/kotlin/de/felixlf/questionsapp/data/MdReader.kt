package de.felixlf.questionsapp.data

import de.felixlf.questionsapp.domain.Question

class MdReader {
    fun readMd(md: String, questionSetName: String, questionStart: String = "###"): List<Question> {
        val lines = md.lines()
        val questions = mutableListOf<Question>()
        var question = ""
        var answers = mutableListOf<Question.Answer>()
        var rationale: String? = null
        var lineType = LineType.Question

        // Variables para manejar bloques <details>
        var insideDetailsBlock = false
        var detailsContent = StringBuilder()

        for (line in lines) {
            val trimmedLine = line.trim()

            // Detectar inicio de bloque <details>
            if (trimmedLine == "<details>") {
                insideDetailsBlock = true
                detailsContent = StringBuilder()
                continue
            }

            // Detectar fin de bloque </details>
            if (trimmedLine == "</details>") {
                insideDetailsBlock = false
                // Extraer rationale del contenido acumulado
                rationale = extractRationaleFromDetails(detailsContent.toString())
                detailsContent = StringBuilder()
                continue
            }

            // Si estamos dentro de un bloque <details>, acumular contenido
            if (insideDetailsBlock) {
                detailsContent.append(line).append("\n")
                continue
            }

            // Ignorar líneas HTML comunes y separadores
            if (isHtmlOrSeparator(trimmedLine)) {
                continue
            }

            when {
                line.startsWith(questionStart) -> {
                    lineType = LineType.Question
                    if (question.isNotEmpty()) {
                        questions.add(
                            Question(
                                question.trim(),
                                answers,
                                rationale,
                                questionSetName
                            )
                        )
                        answers = mutableListOf()
                        rationale = null
                    }
                    question = line.removePrefix(questionStart).trim()
                }

                line.startsWith("- [") -> {
                    lineType = LineType.Answer
                    val correct = line.contains("[x]")
                    val description = line.removePrefix("- [ ]").removePrefix("- [x]").trim()
                    answers.add(Question.Answer(description, correct))
                }

                line.contains("**Rationale:**") && !insideDetailsBlock -> {
                    // Rationale inline (formato Scrum)
                    lineType = LineType.Rationale
                    rationale = line.substringAfter("**Rationale:**").trim()
                }

                lineType == LineType.Question && line.isNotEmpty() -> {
                    question += "\n" + line
                }

                lineType == LineType.Answer && line.isNotEmpty() && !isHtmlOrSeparator(trimmedLine) -> {
                    val lastAnswer = answers.last()
                    answers[answers.size - 1] =
                        lastAnswer.copy(description = lastAnswer.description + line)
                }

                else -> {
                    // Ignorar líneas vacías u otras
                }
            }
        }

        if (question.isNotEmpty()) {
            questions.add(Question(question.trim(), answers, rationale, questionSetName))
        }

        return questions
    }

    /**
     * Extrae el rationale de un bloque <details>, soportando múltiples líneas
     */
    private fun extractRationaleFromDetails(detailsContent: String): String? {
        val lines = detailsContent.lines()
        var captureRationale = false
        val rationaleBuilder = StringBuilder()

        for (line in lines) {
            val trimmed = line.trim()

            // Ignorar etiquetas HTML
            if (trimmed.startsWith("<") && trimmed.endsWith(">")) {
                continue
            }

            // Detectar inicio del rationale
            if (trimmed.contains("**Rationale:**")) {
                captureRationale = true
                val text = trimmed.substringAfter("**Rationale:**").trim()
                if (text.isNotEmpty()) {
                    rationaleBuilder.append(text).append(" ")
                }
                continue
            }

            // Capturar líneas subsiguientes si estamos en modo captura
            if (captureRationale && trimmed.isNotEmpty()) {
                rationaleBuilder.append(trimmed).append(" ")
            }
        }

        val result = rationaleBuilder.toString().trim()
        return if (result.isNotEmpty()) result else null
    }

    /**
     * Detecta si una línea es un tag HTML o separador que debe ignorarse
     */
    private fun isHtmlOrSeparator(line: String): Boolean {
        val trimmed = line.trim()
        return trimmed.isEmpty() ||
                trimmed == "---" ||
                trimmed.startsWith("<") && trimmed.endsWith(">") ||
                trimmed.startsWith("**[⬆") // Navigation links
    }

    private enum class LineType { Question, Answer, Rationale }
}