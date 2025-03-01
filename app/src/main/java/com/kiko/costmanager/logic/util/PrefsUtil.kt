package com.kiko.costmanager.logic.util

import android.content.Context
import android.content.SharedPreferences

object PrefsUtil {
    private var sharedPreferences: SharedPreferences? = null
    private const val SHARED_PREF_NAME = "MySharedPref"
    private const val KEY_USERNAME = "keyUserName"
    private const val KEY_PASSWORD = "keyPassword"
    private const val KEY_EMAIL = "keyEmail"
    private const val KEY_FINISH = "keyFinish"
    fun initPrefsUtil(context: Context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
    }

    var userName: String?
        get() = sharedPreferences?.getString(KEY_USERNAME, "")
        set(value) {
            sharedPreferences?.edit()?.putString(KEY_USERNAME, value)?.apply()
        }

    var userPassword: String?
        get() = sharedPreferences?.getString(KEY_PASSWORD, "")
        set(value) {
            sharedPreferences?.edit()?.putString(KEY_PASSWORD, value)?.apply()
        }

    var userEmail: String?
        get() = sharedPreferences?.getString(KEY_EMAIL, "")
        set(value) {
            sharedPreferences?.edit()?.putString(KEY_EMAIL, value)?.apply()
        }

    var onBoardingFinish: Boolean?
        get() = sharedPreferences?.getBoolean(KEY_FINISH, false)
        set(value) {
            sharedPreferences?.edit()?.putBoolean(KEY_FINISH, value!!)?.apply()
        }
}