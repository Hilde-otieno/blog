package com.example.myblogassignment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myblogassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)


    }

    fun displayBlogs(){
        val blog1 = Blog("", "1978-04-23", "Elroy", "Blossoms", "Hello there")
        val blog2 = Blog("", "1989-04-23", "Collo", "Blossoms", "Hello there")
        val blog3 = Blog("", "1935-04-23", "Michael Ochieng", "Blossoms", "Hello there")
        val blog4 = Blog("", "1990-04-23", "Elroy", "Blossoms", "Hello there")
        val blog5 = Blog("", "2000-04-23", "Gregor", "Blossoms", "Hello there")
        val blog6 = Blog("", "1946-04-23", "Maritim", "Blossoms", "Hello there")
        val blog7 = Blog("", "2003-04-23", "Micky", "Blossoms", "Hello there")
    }

}