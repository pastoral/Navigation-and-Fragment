package com.example.scrapsweetteeth

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_donuts.view.*
import kotlinx.android.synthetic.main.fragment_ice_cream.view.*


class DonutsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v : View = inflater.inflate(R.layout.fragment_donuts, container, false)
        v.btn_donut.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_donutsFragment_to_cahmpionFragment)
        }
        return v
    }


}
