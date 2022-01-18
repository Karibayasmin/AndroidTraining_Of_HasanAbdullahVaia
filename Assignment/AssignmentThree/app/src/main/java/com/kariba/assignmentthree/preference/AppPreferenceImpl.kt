package com.kariba.assignmentthree.preference

import android.content.Context

/**
 * Created by Kariba Yasmin on 7/14/21.
 */
class AppPreferenceImpl(context: Context): AppPreference {

    /* 1. Here Context is the abstract class. And getSharedPreferences() method is the abstract method of that Context class.
    * 2. getSharedPreferences has 2 parameter, one is the name of Shared preference another one is accessible mode.
    * 3. Inside Context class there has assigned 0 value with addressed "public static final int". That's why instead of
    * Context.MODE_PRIVATE, if I use 0 it will work perfect
    * 4. The means of this private mode only from this app these data are accessible.*/

    /* 1. Shared Preference is an interface
    *  2. Inside shared preference there has editor interface.
    * 3. Through this editor we use some signature method like putString(), putInt()....and so on to save data.
    * 4. At last through editor.apply() method we save the data*/

    private val sharedPreferences = context.getSharedPreferences("my_app_pref", Context.MODE_PRIVATE)
    private val editor = sharedPreferences.edit()

    override fun getString(key: String): String? {
        return sharedPreferences.getString(key,"")
    }

    override fun setString(key: String, value: String) {
        editor.putString(key,value)
        editor.apply()
    }

    override fun getInt(key: String): Int? {
        return  sharedPreferences.getInt(key, -1)
    }

    override fun setInt(key: String, value: Int) {
        editor.putInt(key,value)
        editor.apply()
    }

    override fun getBoolean(key: String): Boolean? {
        return sharedPreferences.getBoolean(key, false)
    }

    override fun setBoolean(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.apply()
    }

    override fun setIsLoggedData(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.apply()
    }

    override fun getIsLoggedData(key: String): Boolean? {
        return sharedPreferences.getBoolean(key, false)
    }

}