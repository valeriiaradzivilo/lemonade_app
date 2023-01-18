package com.example.makelemonade

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class Rotten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rotten_screen)

        val lemonCut: Button = findViewById(R.id.go_main)
        lemonCut.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)


        }


    }
}
