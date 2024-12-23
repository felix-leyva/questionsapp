package de.felixlf.questionsapp

import de.felixlf.questionsapp.domain.Question

class MdReader {
    fun readMd(md: String): List<Question> {
        val lines = md.lines()
        val questions = mutableListOf<Question>()
        var question = ""
        var answers = mutableListOf<Question.Answer>()
        var lineType = LineType.None

        for (line in lines) {
            when {
                line.startsWith("###") -> {
                    if (question.isNotEmpty()) {
                        questions.add(Question(question, answers))
                        answers = mutableListOf()
                    }
                    question = line.removePrefix("###").trim()
                    lineType = LineType.Question
                }
                line.startsWith("- [") -> {
                    lineType = LineType.Answer
                    val correct = line.contains("[x]")
                    val description = line.removePrefix("- [ ]").removePrefix("- [x]").trim()
                    answers.add(Question.Answer(description, correct))
                }
                lineType == LineType.Question && line.isNotEmpty() -> {
                    question += line
                }
                lineType == LineType.Answer && line.isNotEmpty() -> {
                    val lastAnswer = answers.last()
                    answers[answers.size - 1] = lastAnswer.copy(description = lastAnswer.description + line)
                }
                else -> {
                    lineType = LineType.None
                }
            }
        }

        if (question.isNotEmpty()) {
            questions.add(Question(question, answers))
        }

        return questions
    }
    private enum class LineType { Question, Answer, None }
}