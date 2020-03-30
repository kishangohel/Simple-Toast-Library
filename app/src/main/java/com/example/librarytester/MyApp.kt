package com.example.librarytester

import android.app.Application
import kishan.library.ktoaster.ToastMessage

class MyApp: Application(){
    override fun onCreate() {
        super.onCreate()
        ToastMessage.initialize(this)
    }
}