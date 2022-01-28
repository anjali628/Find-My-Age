package com.example.findmyage

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.findmyage.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bGetAge?.setOnClickListener {

            //add code run when button click
            //val userDOB: Int = Integer.parseInt(binding.editTextDate.text.toString())

            val userDOB=binding.editTextDate.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val userAgeInYears = currentYear - userDOB
            binding.textView.text = "Your age is $userAgeInYears Years"
            Log.d("LogsMe","Your age is $userAgeInYears Years")
        }
    }
}
