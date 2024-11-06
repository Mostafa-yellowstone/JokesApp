package myst.mostafayellowstone.jokesapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import myst.mostafayellowstone.jokesapp.model.JokeResponse
import myst.mostafayellowstone.jokesapp.repositories.JokeRepositories
import myst.mostafayellowstone.jokesapp.utils.State

class JokeViewModel: ViewModel() {
    private val repo = JokeRepositories()
    private val _joke = MutableLiveData<State<JokeResponse?>>()
    val joke: LiveData<State<JokeResponse?>> = _joke


    fun getRandomJoke(){
        viewModelScope.launch {
            repo.getRandomJoke().collect{
                _joke.postValue(it)
            }
        }
    }
}