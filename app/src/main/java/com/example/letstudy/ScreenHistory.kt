package com.example.letstudy


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.letstudy.data.questions


@Composable
fun ScreenHistory() {
    var currentQuestionIndex by remember { mutableStateOf(0) }
    val currentQuestion = questions[currentQuestionIndex]
    var score by remember { mutableStateOf(0) }
    var showScore by remember { mutableStateOf(false) } // State to control score visibility

    var buttonColors = remember {
        mutableStateListOf<Color>(*List(currentQuestion.options.size)
        {Color.Blue}.toTypedArray()) }

    var disableButton = remember {
        mutableStateListOf<Boolean>(*List(currentQuestion.options.size)
        {false}.toTypedArray()) }

    var isButtonVisible by remember { mutableStateOf(false) }

    if (showScore) {
        // Display the score screen
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Quiz Completed!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Your Score: $score out of ${questions.size}",
                fontSize = 20.sp
            )
        }
    } else {
        // Display the quiz questions
        Column(
            modifier = Modifier
                .padding(start = 16.dp, top = 30.dp, end = 16.dp)
        ) {
            Text(text = "Question ${currentQuestionIndex + 1}/${questions.size}")
            LinearProgressIndicator(
                progress = (currentQuestionIndex + 1f) / questions.size,
                color = Color.Green,
                modifier = Modifier.fillMaxWidth()
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp)
            ) {
                Column(
                    modifier = Modifier
                        .wrapContentSize()
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(10.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 22.sp,
                        text = currentQuestion.question
                    )
                }
            }
            // Button handling
            currentQuestion.options.forEachIndexed { index, option ->
                Button(
                    onClick = {
                        val isCorrect = checkAnswer(index, currentQuestion.correctAnswer)
                        if (isCorrect) { // Right answer
                            score++ // Update score here
                            buttonColors[index] = Color.Green
                            disableButton[index] = true
                            isButtonVisible = !isButtonVisible

                        }else{ // Wrong answer
                            buttonColors[index] = Color.Red
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = !disableButton[index],
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if(!disableButton[index])
                            buttonColors[index] else Color.Gray,
                        disabledContainerColor = if (disableButton[index])
                        buttonColors[index] else Color.Gray),
                ) {
                    Text(option, fontSize = 17.sp)
                }
            }
            if (isButtonVisible) {
                Button(
                    onClick = {
                        if (currentQuestionIndex < questions.size - 1) {
                            currentQuestionIndex++
                            buttonColors.fill(Color.Blue)
                            disableButton.fill(false)
                            isButtonVisible = false

                        } else {
                            showScore = true // Show score screen when quiz is completed
                        }
                    },
                    modifier = Modifier.align(Alignment.End),
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                ) { Text("Next") }

            }

            //NextButton()
        }
    }
}

// Function to check user's answer selection
fun checkAnswer(selectedOption: Int, correctAnswer: Int): Boolean {
    return selectedOption + 1 == correctAnswer // Add 1 to selectedOption
}
//@Composable
//fun NextButton() {
//    Button(
//        onClick = { /* Handle button click */ },
//        modifier = Modifier.padding(16.dp),
//        colors = ButtonDefaults.buttonColors(Color.Blue)
//    ) {
//        Text("Nexssst")
//    }
//}