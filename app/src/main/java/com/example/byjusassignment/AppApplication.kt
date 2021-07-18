package com.example.byjusassignment

import android.app.Application
import androidx.databinding.library.BuildConfig
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }
}