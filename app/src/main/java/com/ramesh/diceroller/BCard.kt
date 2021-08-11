package com.ramesh.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class BCard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_card)
        val profileName=intent.getStringExtra("message")
        val name: TextView = findViewById(R.id.ename);
        name.setText(profileName)
    }

    fun closeThis(view: View) {
        finish();
    }
}