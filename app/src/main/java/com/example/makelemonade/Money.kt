package com.example.makelemonade

import java.io.Serializable

class Money(val value: Double) : Serializable {
    fun updateValue(newValue: Double): Money {
        return Money(value+newValue)
    }

    fun getMoney():Double {
        return value
    }
}