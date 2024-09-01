package com.example.newcitiesapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newcitiesapplication.databinding.FragmentCityDetailsBinding

class CityDetailsFragment : Fragment() {

    lateinit var binding: FragmentCityDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCityDetailsBinding.inflate(inflater,container,false)

        binding.ivCity.setImageResource(R.drawable.city1)
        binding.tvName.text="Dubai"

        return binding.root
    }
}