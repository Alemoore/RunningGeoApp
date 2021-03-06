package com.example.myapplication.ui.viewmodels.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.myapplication.R

import com.example.myapplication.ui.viewmodels.StatisticViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {
    private val viewModel: StatisticViewModel by viewModels()
}