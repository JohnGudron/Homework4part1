package com.example.homework4part1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework4part1.databinding.FragmentDBinding
import com.example.homework4part1.navigator.navigator

class FragmentD : Fragment() {
    private lateinit var binding: FragmentDBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDBinding.inflate(inflater, container, false)
        binding.btnDtoB.setOnClickListener {
            navigator().backToB()
        }
        return binding.root
    }
}