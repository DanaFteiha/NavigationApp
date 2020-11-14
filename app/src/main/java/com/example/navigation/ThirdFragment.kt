package com.example.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment(R.layout.fragment_third){
private val args : ThirdFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_view_username.text = args.username
        text_view_password.text = args.password

        button_ok.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToFirstFragment()
            findNavController().navigate(action)
        }
    }
}