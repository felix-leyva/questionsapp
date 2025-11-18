import de.felixlf.questionsapp.data.MdReader
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class MdReaderTest {
    private lateinit var mdReader: MdReader

    @BeforeTest
    fun setup() {
        mdReader = MdReader()
    }

    @Test
    fun testReadMd() {
        val questions = mdReader.readMd(md = example, "example")
        assertEquals(3, questions.size)
    }

    @Test
    fun testReadMdWithRationale() {
        val questions = mdReader.readMd(md = exampleWithRationale, "exampleWithRationale")

        assertEquals(1, questions.size)
        val question = questions.first()
        assertEquals(
            "According to the introduction, which of the following topics will be covered in this chapter?",
            question.question
        )
        assertEquals(6, question.answers.size)
        assertNotNull(question.rationale)
        assertEquals(
            "The text explicitly states that the chapter will cover \"the basic terms and definitions of software architecture\", \"differentiate software architecture from enterprise architecture\", and \"what role a software architect plays in a project and what goals we pursue with software architecture.\"",
            question.rationale
        )
    }

    @Test
    fun testReadMdWithoutRationale() {
        val questions = mdReader.readMd(md = example, "example")

        questions.forEach { question ->
            assertNull(question.rationale)
        }
    }

    @Test
    fun testWithRealData() {
        val path = "files/isaqb/"
        val fileName = "067_3.2.4.4_arch_doc_-_views_-_deployment_view-verified.md"
        val resourcePath = path + fileName
        val fileContent = readTestResource(resourcePath)

        assertNotNull(fileContent, "Test resource should exist")

        val questions =
            mdReader.readMd(md = fileContent, questionSetName = fileName, questionStart = "##")

        assertTrue(questions.isNotEmpty(), "Should parse questions from real file")
        questions.forEach { question ->
            assertNotNull(question.question, "Question text should not be null")
            assertTrue(question.answers.isNotEmpty(), "Question should have answers")
        }
    }

    private fun readTestResource(path: String): String? {
        return this::class.java.classLoader?.getResourceAsStream(path)?.bufferedReader()
            ?.use { it.readText() }
    }
}

const val example =
    "### The Product Owner is not collaborating with the Development Team during the Sprint. What are two valuable actions for a Scrum Master to take? (choose the best two answers)\n" +
            "\n" +
            "- [ ] Nominate a proxy Product Owner.\n" +
            "- [x] Coach the Product Owner in the values of Scrum and incremental delivery.\n" +
            "- [ ] Stop the Sprint, send the Product Owner to a course and restart.\n" +
            "- [ ] Inform the Product Owner's functional manager.\n" +
            "- [x] Bring up the problem in the Sprint Retrospective.\n" +
            "\n" +
            "**[⬆ Back to Top](#table-of-contents)**\n" +
            "\n" +
            "### A Scrum Master is working with a Development Team that has members in different physical " +
            "locations. The Development Team meets in a variety of meeting rooms and has much to do logistically " +
            "(for example, set up conference calls) before the Daily Scrum. What action should the Scrum Master take? (choose the best answer)\n" +
            "\n" +
            "- [ ] Ask the Development Team members to alternate who is responsible for meeting setup.\n" +
            "- [ ] Set up the meeting and tell the Development Team that is how it will be done.\n" +
            "- [ ] Inform Management and ask them to solve it.\n" +
            "- [x] Allow the Development Team to self-manage and determine for itself what to do.\n" +
            "\n" +
            "**[⬆ Back to Top](#table-of-contents)**\n" +
            "\n" +
            "### Five new Scrum Teams have been created to build one Product. A few of the Developers on one of the Development Teams ask the Scrum Master how to coordinate their work with the other teams. What should the Scrum Master do?\n" +
            "\n" +
            "- [ ] Teach the Product Owner to work with the Lead Developers on ordering Product Backlog in a way to avoid too much technical and development overlap during a Sprint.\n" +
            "- [ ] Collect the Sprint tasks from the teams at the end of their Sprint Planning and merge that into a consolidated plan for the entire Sprint.\n" +
            "- [x] Teach them that it is their responsibility to work with the other teams to create an integrated Increment.\n" +
            "- [ ] Visit the five teams each day to inspect that their Sprint Backlogs are aligned.\n" +
            "\n" + "**[⬆ Back to Top](#table-of-contents)**"

const val exampleWithRationale =
    "### According to the introduction, which of the following topics will be covered in this chapter?\n" +
            "\n" +
            "- [x] The basic terms and definitions of software architecture.\n" +
            "- [ ] How to write code in a specific programming language.\n" +
            "- [x] The difference between software architecture and enterprise architecture.\n" +
            "- [ ] The history of software development methodologies.\n" +
            "- [x] The role of a software architect and the goals of software architecture.\n" +
            "- [ ] How to manage a software development team.\n" +
            "\n" +
            "**Rationale:** The text explicitly states that the chapter will cover \"the basic terms and definitions of software architecture\", \"differentiate software architecture from enterprise architecture\", and \"what role a software architect plays in a project and what goals we pursue with software architecture.\"\n" +
            "\n" +
            "---"