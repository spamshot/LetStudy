package com.example.letstudy.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Courses(
    val id: Int,
    @StringRes val title: Int,
    @DrawableRes val imageResourceId: Int
)
