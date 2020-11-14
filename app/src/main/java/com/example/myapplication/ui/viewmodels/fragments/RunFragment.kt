package com.example.myapplication.ui.viewmodels.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.myapplication.R
import com.example.myapplication.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment: Fragment(R.layout.fragment_run){
    private val viewModel: MainViewModel by viewModels()
}