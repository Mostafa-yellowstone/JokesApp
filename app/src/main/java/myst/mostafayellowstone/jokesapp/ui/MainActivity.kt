package myst.mostafayellowstone.jokesapp.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import myst.mostafayellowstone.jokesapp.R
import myst.mostafayellowstone.jokesapp.databinding.ActivityMainBinding
import myst.mostafayellowstone.jokesapp.viewModels.JokeViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: JokeViewModel by viewModels()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this  , R.layout.activity_main)
        binding.jokeModel = viewModel
        binding.lifecycleOwner = this
    }
}