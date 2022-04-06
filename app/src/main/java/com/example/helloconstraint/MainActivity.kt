package com.example.helloconstraint

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var mCount: Int = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mShowCount = findViewById(R.id.show_count)
    }

    fun countUp(view: View) {
        mCount++
        showCount()
    }

    fun startSecActivity(view: View) {
    }

    private fun showCount() {
        mShowCount?.text = mCount.toString()
    }
}