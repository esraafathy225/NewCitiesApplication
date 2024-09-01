package com.example.newcitiesapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.CityAdapter
import com.example.newcitiesapplication.City
import com.example.newcitiesapplication.R
import com.example.newcitiesapplication.databinding.FragmentCitiesBinding

class CitiesFragment : Fragment() {

    lateinit var binding: FragmentCitiesBinding
    var cities: MutableList<City> = mutableListOf()
    lateinit var cityAdapter: CityAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCitiesBinding.inflate(inflater,container,false)

        cities= mutableListOf(
            City(resources.getString(R.string.newyork),R.drawable.city1),
            City(resources.getString(R.string.ontario),R.drawable.city2),
            City(resources.getString(R.string.cairo),R.drawable.city3),
            City(resources.getString(R.string.dubai),R.drawable.city4)
        )


        cityAdapter=CityAdapter(cities)

        binding.rvCities.adapter=cityAdapter

        return binding.root
    }


}