package myst.mostafayellowstone.jokesapp.utils

sealed class State<out T > {
    data class Success<T>(val data: T): State<T>()
    data class Error( val msg : String ): State<Nothing>()
    object Loading: State<Nothing>()

    fun addData(): T? = if (this is Success) data else null
}