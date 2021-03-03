package com.kariba.a02_constraintlayout_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_input_part.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_submit.setOnClickListener {

            submitButtonAction()

        }
    }

    private fun submitButtonAction() {

        // Log.d("MainActivity","Submit button clicked")
        val name = et_name.text.toString()
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show()

        var value = (1..10).random() // it generates random number

        /*
        * val is immutable object of a class.
        * val is equivalent of final of java
        * var is normal variable.
        * */

        tv_output.text = name

        //tv_name_level.visibility = View.GONE

        //cmd+alt+shift+L will rearrange my project

        group_input.visibility = View.GONE

        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("user_name", name)
        startActivity(intent)

    }
}