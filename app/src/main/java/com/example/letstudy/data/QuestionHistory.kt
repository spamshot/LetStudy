package com.example.letstudy.data

data class QuestionHistory(val question: String, val options: List<String>, val correctAnswer: Int)

val questions = listOf(
    QuestionHistory("World War II began in?", listOf("1835", "1776", "1972", "1939"), 4),
    QuestionHistory("World War I began in?", listOf("1933", "2001", "1914", "1969"), 3),
    QuestionHistory("The First Moon Landing?", listOf("1914", "1969", "2010", "1991"), 2),
    QuestionHistory("June 6, 1944 is best known for?", listOf("D-Day", "Fall of the Berlin Wall", "Battle of Hastings", "9/11 Attacks"), 1),
    QuestionHistory("What year was The Declaration of Independence", listOf("1926", "1770", "1948", "1776"), 4),
    // ... other questions
)