package com.example.letstudy

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ScreenPhysics() {
    Column(
        modifier = Modifier
            .padding(start = 16.dp, top = 30.dp, end = 16.dp)
    ) {
        Text(text = "Question 7/20")
        LinearProgressIndicator(
            progress = { 0.35f },
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
                    text = "Can sound waves generate heat?"
                )
            }
        }
        Button(modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }) {
            Text("Paris", fontSize = 17.sp)
        }
        Button(modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }) {
            Text("Helena", fontSize = 17.sp)
        }
        Button(modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }) {
            Text("Rome", fontSize = 17.sp)
        }
        Button(modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }) {
            Text("Madrid", fontSize = 17.sp)
        }
        Button(modifier = Modifier
            .align(Alignment.End)
            .padding(top = 16.dp),
            onClick = { /*TODO*/ }) {
            Text("Next", fontSize = 17.sp)
        }


    }
}