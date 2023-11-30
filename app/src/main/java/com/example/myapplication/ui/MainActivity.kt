package com.example.myapplication.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.ui.MainViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
Created by Prokash Sarkar on Tue, January 19, 2021
 **/

class MainActivity : DaggerAppCompatActivity() {

    private val TAG = "MainActivity:"

    // Part of the activity lifecycle
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<MainViewModel> { viewModelFactory }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeViewData()

        viewModel.getSearchResponse("android")
    }

    private fun observeViewData() {
        viewModel.items.observe(this, {

        })
    }
}