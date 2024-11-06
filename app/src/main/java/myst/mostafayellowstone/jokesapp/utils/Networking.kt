package myst.mostafayellowstone.jokesapp.utils
import myst.mostafayellowstone.jokesapp.interfaces.JokeApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Networking {
    const val BASE_URL = "https://v2.jokeapi.dev/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val networkService = retrofit.create(JokeApi::class.java)
}