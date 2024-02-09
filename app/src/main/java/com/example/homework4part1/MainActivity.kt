package com.example.homework4part1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.homework4part1.databinding.ActivityMainBinding
import com.example.homework4part1.navigator.Navigator

class MainActivity : AppCompatActivity(), Navigator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, FragmentA())
                .commit()

        }
    }

    override fun toRootFragment() {
        supportFragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }

    override fun showB() {
        launchFragment(FragmentB(), "B")
    }

    override fun showC(text:String) {
        launchFragment(FragmentC.newInstance(getString(R.string.hello_fragment_c)), "C")
    }

    override fun showD() {
        launchFragment(FragmentD(), "D")
    }

    override fun backToB() {
        supportFragmentManager.popBackStack("B",0)
    }

    private fun launchFragment(fragment: Fragment, name: String) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(name)
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}