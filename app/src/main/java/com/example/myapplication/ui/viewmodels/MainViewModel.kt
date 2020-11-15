package com.example.myapplication.ui.viewmodels

import android.app.Application
import android.content.Context
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import com.example.myapplication.repositories.MainRepository
import dagger.hilt.android.qualifiers.ApplicationContext

class MainViewModel @ViewModelInject constructor(
        app: Application,
        mainRepository: MainRepository): AndroidViewModel(app) {
}