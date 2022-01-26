package com.example.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    var x = 7
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "Mostafa".Print()
        Car.name

    }

    fun returnValue(num: Int): Int {
        return num
    }

    fun String.Print() {
        print("Hello World : $this")
    }

    private fun getSum() {
        print("Hello world : $x")

    }
}