package com.example.letstudy.data

data class QuestionHistory(val question: String, val options: List<String>, val correctAnswer: Int)

val questions = listOf(
    QuestionHistory("World War II began in what year?", listOf("1835", "1776", "1972", "1939"), 4),
    QuestionHistory("World War I began in what year?", listOf("1933", "2001", "1914", "1969"), 3),
    QuestionHistory("When was the First Moon Landing?", listOf("1914", "1969", "2010", "1991"), 2),
    QuestionHistory("June 6, 1944 is best known for?", listOf("D-Day", "Fall of the Berlin Wall", "Battle of Hastings", "9/11 Attacks"), 1),
    QuestionHistory("What year was The Declaration of Independence signed", listOf("1926", "1770", "1948", "1776"), 4),
    QuestionHistory("The United States bought Alaska from which country?", listOf("Mexico", "Russia", "China", "Canada"), 2),
    QuestionHistory("Who was the first emperor of China?", listOf("Qin Shi Huang", "Hongwu Emperor", "Jiaqing Emperor", "Kublai Khan"), 1),
    QuestionHistory("What leader came to power in Cuba after the Cuban Revolution?", listOf("Che Guevara", "Huber Matos", "Fidel Castro", "Frank País"), 3),
    QuestionHistory("Who was England's longest-ruling monarch?", listOf("Queen Elizabeth II", "King Charles", "Edward III", "Queen Victoria"), 1),
    QuestionHistory("When did India win independence from the United Kingdom?", listOf("1974", "1950", "1930", "1947"), 4),
    QuestionHistory("Who was the first democratically elected president of South Africa?", listOf("Max Theiler", "Richard Goldstone", "Nelson Mandela", "Elon Musk"), 3),
    // todo add more questions for history here
)