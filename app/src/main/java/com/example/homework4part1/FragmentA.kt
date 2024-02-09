package com.example.homework4part1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework4part1.databinding.FragmentABinding
import com.example.homework4part1.navigator.navigator

class FragmentA : Fragment() {

    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentABinding.inflate(inflater, container, false)
        binding.btnAtoB.setOnClickListener {
            navigator().showB()
        }
        return binding.root
    }
}