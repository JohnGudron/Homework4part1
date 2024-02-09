package com.example.homework4part1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework4part1.databinding.FragmentBBinding
import com.example.homework4part1.navigator.navigator

class FragmentB : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        binding.btnBtoC.setOnClickListener {
            navigator().showC(getString(R.string.hello_fragment_c))
        }
        binding.btnBbackToA.setOnClickListener {
            navigator().toRootFragment()
        }

        return binding.root
    }
}