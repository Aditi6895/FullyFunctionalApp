package com.example.fullyfunctionalapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView


class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val appButton=findViewById<CardView>(R.id.cardAppDev)

        appButton.setOnClickListener {
           val app=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.geeksforgeeks.org/android-tutorial/") )
            startActivity(app)
        }
        val webButton=findViewById<CardView>(R.id.cardWebDev)

        webButton.setOnClickListener {
            val web = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.geeksforgeeks.org/web-development/"))
            startActivity(web)
        }

        val mlButton=findViewById<CardView>(R.id.cardML)

        mlButton.setOnClickListener {
           val ml=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.w3schools.com/python/python_ml_getting_started.asp"))
            startActivity(ml)
        }


        val callButton=findViewById<Button>(R.id.button2)

        callButton.setOnClickListener {
           val intent=Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:" + "6299096208")
            startActivity(intent)
        }

    }
}