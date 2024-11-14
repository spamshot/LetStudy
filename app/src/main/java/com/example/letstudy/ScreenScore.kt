package com.example.letstudy


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlin.math.roundToInt


val minimumGrade = 65

@Composable
fun ScreenScore(navController: NavController, score: Int, totalQuestions: Int) {


    //Image is used as background
    Column(modifier = Modifier.fillMaxSize()){
        val imageResource =
            if (mingrade(score, totalQuestions)){
            R.drawable.goodjobbk
        } else {
            R.drawable.badjobbk
        }
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = "score",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 232.dp)
                .height(450.dp)
                .width(550.dp)
        )
    }


    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Total Questions: $totalQuestions",
            Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 33.dp),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        )

        Text(
            "Correct Answers: $score of $totalQuestions", Modifier
                .padding(top = 30.dp, start = 10.dp)
        )

        Text(
            "${grade(score, totalQuestions)}%", Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 40.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            "Minimum set by teacher is 65%", Modifier
                .padding(top = 16.dp, start = 10.dp)
        )
        //Column is used to align the buttons in the center, easier with 2 columns
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(
                onClick = {
                    navController.navigate("start_screen")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, bottom = 20.dp),
            ) {
                Text("Courses")

            }
        }
    }
}
    //TODO Only show 2 decimal places

fun grade(score: Int, totalQuestions: Int): Double { // math for grade
    Log.d("grade", "totalQuestions: $totalQuestions, score: $score")
    val result = (score.toDouble() / totalQuestions.toDouble()) * 100
    return String.format("%.2f", result).toDouble() // rounds to 2 decimal places

}

fun mingrade(score: Int, totalQuestions: Int): Boolean { //returns true if the minimum grade is met
    return grade(score, totalQuestions) >= minimumGrade
}

