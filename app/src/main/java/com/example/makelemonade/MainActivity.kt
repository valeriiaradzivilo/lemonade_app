package com.example.makelemonade

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.time.temporal.TemporalAmount
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private var mon=Money(0.0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lemon1: ImageButton = findViewById(R.id.lemon)
        val lemon2: ImageButton = findViewById(R.id.lemon2)
        val lemon3: ImageButton = findViewById(R.id.lemon3)

        //working with money
        val mon_balance : TextView = findViewById(R.id.money_balance)



        if(intent!=null && intent?.hasExtra("money_from_final")!=null)
        {
            val money_from_final = intent?.getSerializableExtra("money_from_final") as? Money
            if (money_from_final != null) {
                mon = Money(money_from_final.getMoney())
            }
        }
        println("Balance main: "+mon.getMoney())
        mon_balance.text = mon.getMoney().toString()

        lemon1.setOnClickListener{lemonsFunc(mon)  }
        lemon2.setOnClickListener{lemonsFunc(mon)  }
        lemon3.setOnClickListener{lemonsFunc(mon)  }







}




    private fun lemonsFunc(money:Money){
        val rotten = Random.nextBoolean()
        if(rotten)
        {
            val intent = Intent(this, Rotten::class.java)
            startActivity(intent)
        }
        else
        {
            val intent = Intent(this, SecondStep::class.java)
            intent.putExtra("money", money)
            startActivity(intent)
        }
    }


}

