package com.example.librarytester

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kishan.library.ktoaster.ToastMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastMessage.s("Test Toast")
    }
}
