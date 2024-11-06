package myst.mostafayellowstone.jokesapp.repositories

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import myst.mostafayellowstone.jokesapp.model.JokeResponse
import myst.mostafayellowstone.jokesapp.utils.Networking
import myst.mostafayellowstone.jokesapp.utils.State
import retrofit2.Response

class JokeRepositories {
     suspend fun getRandomJoke(): Flow<State<JokeResponse?>>{
        return wrapWithFlow { Networking.networkService.getRandomJoke() }
     }

    fun <T> wrapWithFlow(function: suspend ()-> Response<T>):Flow<State<T?>>{
        return flow {
            try {
                emit(State.Loading)
                val result = function()
                if (result.isSuccessful){
                    emit(State.Success(result.body()))
                }else{
                    emit(State.Error(result.message()))
                }
            }catch (e: Exception){
                emit(State.Error(e.message.toString()))
            }
        }

    }

}