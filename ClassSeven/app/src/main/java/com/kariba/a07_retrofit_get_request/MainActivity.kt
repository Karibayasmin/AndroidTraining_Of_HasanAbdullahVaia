package com.kariba.a07_retrofit_get_request

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val string = "John"

        string.let {
            it.toLowerCase()
        }

        string.let { myString ->
            myString.toLowerCase()
        }

    }
}