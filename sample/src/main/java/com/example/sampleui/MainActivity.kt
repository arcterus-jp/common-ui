package com.example.sampleui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var icon : ImageView = findViewById(R.id.icon)
        var primaryText : TextView = findViewById(R.id.primary_text)
        var secondaryText : TextView = findViewById(R.id.secondary_text)

        icon.setImageResource(R.mipmap.ic_launcher)
        primaryText.text = "text1"
        secondaryText.text = "text2"
        findViewById<ViewGroup>(R.id.container).setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
        }

        var profileIcon = findViewById<ViewGroup>(R.id.include2).findViewById(R.id.icon) as ImageView
        var text = findViewById<ViewGroup>(R.id.include2).findViewById(R.id.text) as TextView
        profileIcon.setImageResource(R.mipmap.ic_launcher)
        text.text = "text"
    }
}
