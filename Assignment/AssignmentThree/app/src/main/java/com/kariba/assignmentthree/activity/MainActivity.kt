package com.kariba.assignmentthree.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kariba.assignmentthree.R
import com.kariba.assignmentthree.preference.AppPreference
import com.kariba.assignmentthree.preference.AppPreferenceImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var appPreference : AppPreference // declared a variable but didn't initialize.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*We can't create direct instance or object of any interface. If we want to create instance
        * of that interface, we can by using the implementation class of that interface
        * like below. Then through that class we can use the method of that interface.*/

        /*We have passed context with implementation class, because we the context for shared preference*/
        appPreference = AppPreferenceImpl(this)

        switchToRegister()

    }

    private fun switchToRegister() {
        textView_register.setOnClickListener {
            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}