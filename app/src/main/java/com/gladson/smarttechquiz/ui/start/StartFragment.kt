package com.gladson.smarttechquiz.ui.start

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gladson.smarttechquiz.R
import com.gladson.smarttechquiz.databinding.StartFragmentBinding

class StartFragment : Fragment() {

    private lateinit var viewModel: StartViewModel
    private var _binding: StartFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = StartFragmentBinding.inflate(layoutInflater, container, false)

        setupViews()

        return binding.root
    }

    private fun setupViews() {

        with(binding) {
            txtSignUp.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_createAccountFragment)
            }

            btnSignIn.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_mainMenuFragment)
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}