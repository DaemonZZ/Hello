package com.daemonz.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frg = ViewFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView,frg)
            .commit()
    }
}