package com.emmanuel_rono.shared_view_model

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.emmanuel_rono.shared_view_model.databinding.FragmentInputBinding
import com.emmanuel_rono.shared_view_model.databinding.FragmentOutputBinding
class output_Fragment : Fragment(R.layout.fragment_output) {
    lateinit var binding: FragmentOutputBinding
    private val sharedViewModel:sharedViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOutputBinding.bind(view)
        sharedViewModel.Name.observe(viewLifecycleOwner,{ Name -> binding.tvName.setText(Name)
        })
        }
    }















#1.Make fragment aware of the scope
        lateinit var sharedViewModel:sharedViewModel by ActivityViewModel()
lateinit var binding