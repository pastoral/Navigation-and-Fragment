package com.example.scrapsweetteeth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_cahmpion.view.*
import kotlinx.android.synthetic.main.fragment_donuts.view.*

/**
 * A simple [Fragment] subclass.
 */
class CahmpionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v : View = inflater.inflate(R.layout.fragment_cahmpion, container, false)
        v.btn_champion.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_cahmpionFragment_to_bakeryFragment)
        }
        return v
    }


}
