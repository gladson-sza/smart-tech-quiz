package com.gladson.smarttechquiz.ui.createaccount

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gladson.smarttechquiz.R
import com.gladson.smarttechquiz.databinding.CreateAccountFragmentBinding
import com.gladson.smarttechquiz.databinding.StartFragmentBinding

class CreateAccountFragment : Fragment() {


    private lateinit var viewModel: CreateAccountViewModel
    private var _binding: CreateAccountFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = CreateAccountFragmentBinding.inflate(layoutInflater, container, false)

        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreateAccountViewModel::class.java)
    }

}