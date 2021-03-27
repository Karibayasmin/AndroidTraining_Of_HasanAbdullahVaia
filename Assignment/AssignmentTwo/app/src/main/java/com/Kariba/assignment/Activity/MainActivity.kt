package com.Kariba.assignment.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.Kariba.assignment.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitLogin_button.setOnClickListener {
            SwitchToEditProfile()
        }
    }

    private fun SwitchToEditProfile() {
        if(valid()){
            var intent = Intent(this@MainActivity, EditProfile::class.java)
            startActivity(intent)
            finish()

        }
    }

    private fun valid(): Boolean {
        if(email_editTextView.text.toString() == "k" && password_editTextView.text.toString() == "1"){
            return true

        }else if(email_editTextView.text.toString() == ""){
            Toast.makeText(this,"Please Enter Email Address",Toast.LENGTH_SHORT).show()

        }else if(password_editTextView.text.toString() == ""){
            Toast.makeText(this,"Please Enter Password",Toast.LENGTH_SHORT).show()

        }else{
            Toast.makeText(this,"Please Enter Valid Credentials",Toast.LENGTH_SHORT).show()
        }
        return false
    }
}