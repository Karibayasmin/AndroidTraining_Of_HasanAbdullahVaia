package com.kariba.assignmentthree.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kariba.assignmentthree.R
import com.kariba.assignmentthree.preference.AppPreference
import com.kariba.assignmentthree.preference.AppPreferenceImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var appPreference : AppPreference // declared a variable but didn't initialize.

    var userId = ""
    var password = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*We can't create direct instance or object of any interface. If we want to create instance
        * of that interface, we can by using the implementation class of that interface
        * like below. Then through that class we can use the method of that interface.*/

        /*We have passed context with implementation class.*/
        appPreference = AppPreferenceImpl(this)

        switchToProfile()

        switchToRegister()

    }

    private fun switchToProfile() {
        button_logIn.setOnClickListener {
            if(!isValid()){
                return@setOnClickListener
            }else{
                conternDataToString()

                appPreference.setIsLoggedData(AppPreference.IS_LOGGED_IN, true)

                var intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }

    private fun conternDataToString() {
        userId = editText_iD.text.toString()
        password = editText_password.text.toString()
    }

    private fun switchToRegister() {
        textView_register.setOnClickListener {
            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

   private fun  isValid() : Boolean {

       if(userId.trim().isEmpty()){
           Toast.makeText(this, getString(R.string.empty_user_id), Toast.LENGTH_SHORT).show()
           return false
       }

       if(password.trim().isEmpty()){
           Toast.makeText(this, getString(R.string.empty_password), Toast.LENGTH_SHORT).show()
           return false
       }

       if(userId.trim() != appPreference.getString(AppPreference.USER_ID)){
           Toast.makeText(this, getString(R.string.mismatch_user_id), Toast.LENGTH_SHORT).show()
           return false
       }

       if(password.trim() != appPreference.getString(AppPreference.PASSWORD)){
           Toast.makeText(this, getString(R.string.mismatch_password), Toast.LENGTH_SHORT).show()
           return false
       }

        return true
    }
}