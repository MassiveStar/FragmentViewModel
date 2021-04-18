package com.example.fragmentviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentviewmodel.databinding.FragmentBlank2Binding

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment2 : Fragment() {

    lateinit var binding: FragmentBlank2Binding
    lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_blank2,
            container,false)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.name.observe(requireActivity(), Observer {
            binding.textView3.text = it.toString()
        } )

        return binding.root
    }

}