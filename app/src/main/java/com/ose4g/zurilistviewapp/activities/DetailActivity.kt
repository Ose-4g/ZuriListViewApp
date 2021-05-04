package com.ose4g.zurilistviewapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ose4g.zurilistviewapp.Constants
import com.ose4g.zurilistviewapp.R
import com.ose4g.zurilistviewapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val logo = intent.getIntExtra(Constants.LOGO,0)
        val detail = intent.getStringExtra(Constants.DETAIL)
    }
}