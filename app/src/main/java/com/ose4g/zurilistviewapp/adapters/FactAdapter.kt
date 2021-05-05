package com.ose4g.zurilistviewapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.ose4g.zurilistviewapp.Constants
import com.ose4g.zurilistviewapp.activities.DetailActivity
import com.ose4g.zurilistviewapp.databinding.FactsItemBinding
import com.ose4g.zurilistviewapp.models.FactModel

class FactAdapter (val aContext:Context, val facts:List<FactModel> ):ArrayAdapter<FactModel>(aContext, 0, facts)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val fact = getItem(position)
        val binding:FactsItemBinding = FactsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        if(view== null)
        {
            view = binding.root
        }

        //sets the required values in the views using view binding.
        binding.logo.setImageResource(fact!!.logo)
        binding.name.text = fact.name
        binding.cardView.setOnClickListener {
            val intent = Intent(aContext,DetailActivity::class.java)
            intent.putExtra(Constants.LOGO,fact.logo)
            intent.putExtra(Constants.DETAIL, fact.fact)
            intent.putExtra(Constants.NAME, fact.name)
            aContext.startActivity(intent)
        }

        return view

    }
}
