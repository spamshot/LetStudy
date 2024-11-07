package com.example.letstudy

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.letstudy.data.Datasource
import com.example.letstudy.model.Courses


@Composable
fun CourseApp() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "start_screen") {
        composable("start_screen") { StartScreen(navController) }
        composable("history_screen") { ScreenHistory(navController) }
        composable("physics_screen") { ScreenPhysics() }
        composable("ScreenScorePage") { ScreenScorePage(navController) }
    }
}
@Composable
fun CourseList(courseList: List<Courses>, navController: NavHostController) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(courseList) { course ->
            val route = when (course.title) {
                R.string.history -> "history_screen"
                R.string.physics -> "physics_screen"
                // ... other course titles and routes ...
                else -> "start_screen" // Default route if no match
            }
            CourseCard(course, navController, route) // Pass the route to CourseCard
        }
    }
}

@Composable
fun CourseCard(course: Courses, navController: NavHostController, route: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                navController.navigate(route)
            }
    ) {
        Column {
            Image(
                painter = painterResource(course.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(75.dp)
            )
            Text(
                text = stringResource(course.title),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 2.dp, bottom = 2.dp)
                    .fillMaxWidth(),
                color = colorResource(id = R.color.babyblue)
            )
        }
    }
}

@Composable
fun StartScreen(navController: NavHostController) {
    val courseList = Datasource().loadCourses()
    CourseList(courseList, navController)
}