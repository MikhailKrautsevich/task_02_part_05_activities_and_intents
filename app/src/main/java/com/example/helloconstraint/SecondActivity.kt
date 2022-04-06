package com.example.helloconstraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.textview_hello)

        val intent = intent
        val count: Int = intent.getIntExtra(MainActivity.EXTRA_COUNT, 0)
        val textFormatted = String.format("Hello!\n%d", count)
        textView.text = textFormatted
    }
}