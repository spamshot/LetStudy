package com.example.letstudy.data

import com.example.letstudy.model.Courses
import com.example.letstudy.R

class Datasource {

    fun loadCourses(): List<Courses> {
        return listOf(
            Courses(1, R.string.history, R.drawable.history),
            Courses(2, R.string.physics, R.drawable.physics),
            Courses(3, R.string.spanish, R.drawable.spanish),
            Courses(4, R.string.economics, R.drawable.economics),
            Courses(5, R.string.geography, R.drawable.geography),
            Courses(6, R.string.anatomy, R.drawable.anatomy),
            Courses(7, R.string.baking, R.drawable.baking),
            Courses(8, R.string.fitness, R.drawable.fitness),
            Courses(9, R.string.law, R.drawable.laworder),
            Courses(10, R.string.photography, R.drawable.photography),
            Courses(11, R.string.woodworking, R.drawable.woodworking)
        )
    }
}
