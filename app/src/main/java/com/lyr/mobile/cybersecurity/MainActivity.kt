package com.lyr.mobile.cybersecurity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.reflect.Field

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // check if the Xpose was loaded
    fun checkXposed() : Boolean {
        val xpose = ClassLoader.getSystemClassLoader()
                    .loadClass("de.robv.android.xposed.XposedBridge")
        return xpose != null
    }


}