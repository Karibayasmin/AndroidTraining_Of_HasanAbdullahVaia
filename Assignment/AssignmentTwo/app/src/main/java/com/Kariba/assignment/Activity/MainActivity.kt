package com.Kariba.assignment.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.Kariba.assignment.R
import com.Kariba.assignment.Utils.AppConstants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitLogin_button.setOnClickListener {
            switchToEditProfile()
        }
    }

    private fun switchToEditProfile() {
        if(isValid()){
            var intent = Intent(this@MainActivity, EditProfile::class.java)
            startActivity(intent)
            finish()

        }
    }

    private fun isValid(): Boolean {
        val email = email_editTextView.text.toString()
        val password = password_editTextView.text.toString()

        if( email.trim().isNotEmpty() && password.trim().isNotEmpty()){
            if(isEmailValid() && email == AppConstants.EMAIL && password == AppConstants.PASSWORD){
                return true
            }else{
                Toast.makeText(this,getString(R.string.please_enter_valid_credentials),Toast.LENGTH_SHORT).show()
            }
        }else if(email.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_email_address),Toast.LENGTH_SHORT).show()

        }else if(isEmailValid() && password.trim().isEmpty()){
            Toast.makeText(this,getString(R.string.please_enter_password),Toast.LENGTH_SHORT).show()

        }

        return false
    }

    private fun isEmailValid(): Boolean {
        val email : String = email_editTextView.text.toString().trim()
        var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

        if (email.matches(emailPattern.toRegex())) {
            return true
        }
        else {
            Toast.makeText(this,getString(R.string.invalid_email_address), Toast.LENGTH_SHORT).show()
        }

        return false
    }
}