package com.kariba.a02_constraintlayout_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

     //   val bundle = intent.extras
     //   val name = bundle?.getString("user_name")

        val name = intent.getStringExtra("user_name")

        tv_name.text = name
    }
}