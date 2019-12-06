package com.example.scrapsweetteeth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_ice_cream.view.*

/**
 * A simple [Fragment] subclass.
 */
class IceCreamFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view : View = inflater.inflate(R.layout.fragment_ice_cream, container, false)

        view.btn_icecream.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_iceCreamFragment_to_donutsFragment)
        }

        return view
    }


}
