package com.example.quizapp

data class Question (
    val id: Int,
    val question: String,
    val image: Int,

    val optOne: String,
    val optTwo: String,
    val optThree: String,
    val correctAnswer: Int

)