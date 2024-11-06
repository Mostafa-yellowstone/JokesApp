package myst.mostafayellowstone.jokesapp.utils

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["app:showSuccess"])
fun <T> showWhenSuccess(view : View, state: State<T>?){
    if (state is State.Success){
        view.visibility = View.VISIBLE
    }else{
        view.visibility = View.GONE
    }
}

@BindingAdapter(value = ["app:showError"])
fun <T> showWhenError(view : View, state: State<T>?){
    if (state is State.Error){
        view.visibility = View.VISIBLE
    }else{
        view.visibility = View.GONE
    }
}

@BindingAdapter(value = ["app:showLoading"])
fun <T> showWhenLoading(view : View, state: State<T>?){
    if (state is State.Loading){
        view.visibility = View.VISIBLE
    }else{
        view.visibility = View.GONE
    }
}
