package com.example.myapplication.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.myapplication.db.RunDao
import com.example.myapplication.db.RunningDatabase
import com.example.myapplication.util.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRunDao(db: RunningDatabase): RunDao = db.getRunDao()

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext app: Context): RunningDatabase = Room.databaseBuilder(
            app,
            RunningDatabase::class.java,
            RUNNING_DATABASE_NAME)
            .build()


}