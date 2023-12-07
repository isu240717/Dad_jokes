package com.example.dadjokes

data class JokeModel(
    val body:ArrayList<JokeAnswer>
)
data class JokeAnswer(
    val setup:String,
    val punchline:String
)
