package com.example.dadjokes

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface JokeApi {
    //
    @GET("random/joke")
    fun getJoke(
        @Header("X-RapidAPI-Key")
        key:String = "78bb8ecc8dmsha71f7db1db6c66cp1338f5jsn2ae3a25d70d2",
        @Header("X-RapidApi-Host")
        host:String = "dad-jokes.p.rapidapi.com"
    ):Call<JokeModel>
}