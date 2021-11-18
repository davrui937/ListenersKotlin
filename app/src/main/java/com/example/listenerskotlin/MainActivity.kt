package com.example.listenerskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.example.listenerskotlin.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bMiBoton.setOnClickListener{

        binding.tw1.text= Random.nextInt().toString()

        }

        binding.etUno.setOnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                println("Soy etUno y tengo el focus")
            } else {
                println("Soy etUno y no tengo el focus")
            }
        }
        binding.etDos.setOnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                println("Soy etDos y tengo el focus")
            } else {
                println("Soy etDos y no tengo el focus")
            }
        }

        binding.etDos.doOnTextChanged { text, start, before, count ->

            if(text.contentEquals("Hola")){
                Toast.makeText(this,"Hola a ti tb",Toast.LENGTH_LONG).show()
            }
        }
        }
}