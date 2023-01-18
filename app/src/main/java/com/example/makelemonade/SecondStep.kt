package com.example.makelemonade

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class SecondStep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_step)


        val lemonCut: ImageButton = findViewById(R.id.lemon_cut)

        val money = intent.getSerializableExtra("money") as Money
        lemonCut.setOnClickListener{

            val animationSqueeze = AnimationUtils.loadAnimation(this, R.anim.squeeze)
            lemonCut.startAnimation(animationSqueeze)
            lemonCut.postDelayed(Runnable {
                val intent = Intent(this, FinalStep::class.java)
                intent.putExtra("money", money)
                startActivity(intent)
            }, 1000)


        }


    }



}
