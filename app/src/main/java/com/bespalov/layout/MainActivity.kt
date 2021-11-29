package com.bespalov.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.bespalov.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main)

        activityMainBinding.button.setOnClickListener {changeText()}
    }

    private fun changeText() {
        activityMainBinding.textView.text = "Data binding"
    }
}