package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment : Fragment(R.layout.fragment_second) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_confirm.setOnClickListener {
            val username = edit_text_username.text.toString()
            val password = edit_text_password.text.toString()
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(username,password)
            findNavController().navigate(action)
        }
    }
}