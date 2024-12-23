# PSD1 Questions App
Simple app that asks questions from a PSD1 exam and gives the user the option to answer them.
It tracks the user's score and shows the correct answer if the user gets it wrong and within a 
simple algorithm, it will show the user the questions that they got wrong more often.
It tracks the percentage of questions answered correctly and the total number of questions answered
and the total number of questions in the database, so a percentage of completion can be calculated 
and the user can see how much they have left to study.

The App can be run on Android, iOS, Desktop and Web.

# Questions
The questions are stored in a md file in the `commonMain/composeResources` folder. The questions are
parsed using Kotlinx Serialization and are stored in a `Question` class. The questions are then
randomized and displayed to the user.

The md file is based on the repository from Daniel Danielecki 
https://github.com/Ditectrev/Scrum-Developer-I-PSD-I-Practice-Tests-Exams-Questions-Answers 

The app next versions are capable of adding more md files with questions and answers to the database.
A persistance feature is also planned to store the user's progress and the questions that the user
got wrong more often.

# Tech Stack
- Kotlin Multiplatform
- Compose Multiplatform
- Kotlinx Serialization

