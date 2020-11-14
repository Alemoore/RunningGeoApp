package com.example.myapplication.ui.viewmodels

import android.app.Application
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import com.example.myapplication.repositories.MainRepository
import dagger.hilt.android.qualifiers.ApplicationContext

class StatisticViewModel @ViewModelInject constructor(
        @ApplicationContext app: Application,
        mainRepository: MainRepository): AndroidViewModel(app)
{
}