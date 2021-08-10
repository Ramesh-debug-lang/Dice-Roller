package com.ramesh.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Birthday : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)
        val name: TextView = findViewById(R.id.name);
        val create: Button = findViewById(R.id.create);
        create.setOnClickListener {
            val message = name.text.toString();
            if (message.length != 0) {
                val intent = Intent(this, BCard::class.java).apply {
                    putExtra("message", message)
                }
                startActivity(intent);
            }else{
                name.setError("Please Enter your Name")
                Toast.makeText(this,"Please Enter your Name", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun goToDiceRoller(view: View) {
        finish();
    }
}