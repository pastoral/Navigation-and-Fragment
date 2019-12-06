package com.example.scrapsweetteeth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.scrapsweetteeth.databinding.FragmentBakeryBinding
import kotlinx.android.synthetic.main.fragment_bakery.*

/**
 * A simple [Fragment] subclass.
 */
class BakeryFragment : Fragment() {

    lateinit var binding : FragmentBakeryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_bakery,container,false)
        binding.btnBakery.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_bakeryFragment_to_iceCreamFragment)
        }
        return binding.root
    }


}
