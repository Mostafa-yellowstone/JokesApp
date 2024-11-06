package myst.mostafayellowstone.jokesapp.interfaces

import myst.mostafayellowstone.jokesapp.model.JokeResponse
import retrofit2.Response
import retrofit2.http.GET

interface JokeApi {

    @GET("joke/Any")
    suspend fun getRandomJoke(): Response<JokeResponse>



}