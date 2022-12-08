package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import com.example.myapplication1.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tiger = Herbiv("Tiger","orange")
        val bear = Herbiv( "Bear", "brown")
        val goat = Carniv("Goat","gray")
        val giraffe = Carniv("Giraffe","orange")

        val list = listOf(tiger, bear, goat, giraffe)
        println(list)
    }
}