package com.example.makelemonade

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import java.lang.ref.WeakReference

class FinalStep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lemonade)
        val sell_lemon : Button = findViewById(R.id.sell_lemonade)
        val keep_lemon : Button = findViewById(R.id.keep_lemonade)
        val money = intent.getSerializableExtra("money") as Money

        sell_lemon.setOnClickListener {
            val monFinal:Money = changeBalance(MainActivity(), money)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("money_from_final", monFinal)
            startActivity(intent)
        }
    }
    private fun changeBalance(activity: MainActivity, mon:Money):Money {
        val moneyBalance:Double = mon.getMoney() + 15.0
        val money:Money = Money(moneyBalance)
        println("BAAAAAAAAAAAAAAL  "+money.getMoney())
        return  money
    }
}
