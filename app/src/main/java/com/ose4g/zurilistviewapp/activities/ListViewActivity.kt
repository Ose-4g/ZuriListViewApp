package com.ose4g.zurilistviewapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ose4g.zurilistviewapp.R
import com.ose4g.zurilistviewapp.adapters.FactAdapter
import com.ose4g.zurilistviewapp.data.DummyData
import com.ose4g.zurilistviewapp.databinding.ActivityListViewBinding



class ListViewActivity : AppCompatActivity() {

    lateinit var binding:ActivityListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listView.let {
            it.adapter = FactAdapter(this@ListViewActivity, DummyData.funFacts)
            it.divider = getDrawable(android.R.color.transparent)
        }



    }

    override fun onDestroy() {
        binding 
        super.onDestroy()
    }
}