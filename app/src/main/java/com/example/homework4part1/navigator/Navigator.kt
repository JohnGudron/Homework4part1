package com.example.homework4part1.navigator

import androidx.fragment.app.Fragment

fun Fragment.navigator(): Navigator {
    return requireActivity() as Navigator
}

interface Navigator {

    fun toRootFragment()

    fun showB()

    fun showC(text: String)

    fun showD()

    fun backToB()

}