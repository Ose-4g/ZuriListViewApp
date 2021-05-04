package com.ose4g.zurilistviewapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ose4g.zurilistviewapp.R
import com.ose4g.zurilistviewapp.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.materialButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, ListViewActivity::class.java))
        }
    }
}