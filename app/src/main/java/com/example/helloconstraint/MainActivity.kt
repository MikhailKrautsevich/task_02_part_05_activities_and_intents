package com.example.helloconstraint

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_COUNT = "com.example.helloconstraint.COUNT"
    }

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
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(EXTRA_COUNT, mCount)
        startActivity(intent)
    }

    private fun showCount() {
        mShowCount?.text = mCount.toString()
    }
}