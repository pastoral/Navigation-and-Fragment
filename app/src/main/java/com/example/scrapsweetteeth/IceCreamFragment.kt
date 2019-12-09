package com.example.scrapsweetteeth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.scrapsweetteeth.databinding.FragmentIceCreamBinding
import kotlinx.android.synthetic.main.fragment_ice_cream.view.*

/**
 * A simple [Fragment] subclass.
 */
class IceCreamFragment : Fragment() {

    lateinit var binding: FragmentIceCreamBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_ice_cream, container, false)



        return binding.root
    }


}
