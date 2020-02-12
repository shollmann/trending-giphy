package com.shollmann.giphy.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.shollmann.giphy.R
import com.shollmann.giphy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        val binding = DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding

//        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        val viewModel = ViewModelProviders.of(this)[TrendingViewModel::class.java]

//        binding.setViewModel(viewModel)
    }
}
