package com.zw3rk.meetupdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        hsInit()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()
    }

    external fun stringFromJNI(): String
    external fun hsInit()

    companion object {

        // Used to load the 'native-dlib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
