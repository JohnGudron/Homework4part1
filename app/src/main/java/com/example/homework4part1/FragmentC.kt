package com.example.homework4part1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework4part1.databinding.FragmentCBinding
import com.example.homework4part1.navigator.navigator

private const val TEXT = "text"

class FragmentC : Fragment() {

    private lateinit var binding: FragmentCBinding
    private var text: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        text = arguments?.getString(TEXT)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCBinding.inflate(inflater, container, false)
        binding.inputTv.text = text
        binding.btnCtoA.setOnClickListener {
            navigator().toRootFragment()
        }
        binding.btnCtoD.setOnClickListener {
            navigator().showD()
        }
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(text: String) =
            FragmentC().apply {
                arguments = Bundle().apply {
                    putString(TEXT, text)
                }
            }
    }
}