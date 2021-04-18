package com.example.fragmentviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.fragmentviewmodel.databinding.FragmentBlank1Binding

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment1 : Fragment() {

    lateinit var binding: FragmentBlank1Binding
    lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_blank1,container,false)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding.button.setOnClickListener {
            viewModel.setNameData(binding.editTextTextPersonName.text.toString())
            it.findNavController()
                .navigate(R.id.action_blankFragment1_to_blankFragment2)
        }

        return binding.root
    }
}