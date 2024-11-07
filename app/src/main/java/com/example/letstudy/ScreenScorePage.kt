package com.example.letstudy


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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



@Composable
fun ScreenScorePage(navController: NavController) {
    //Image is used as background
    Image(
        painter = painterResource(id = R.drawable.backgroundimagebadjob),
        contentDescription = "score",
        modifier = Modifier.fillMaxSize()
    )

    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Total Questions: 10",
            Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 33.dp),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        )

        Text(
            "Correct Answers: 8 of 10", Modifier
                .padding(top = 30.dp, start = 10.dp)
        )

        Text(
            "80%", Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 40.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            "Minimum set by teacher is 90%", Modifier
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
            ) { Text("Courses") }

        }
    }
}
