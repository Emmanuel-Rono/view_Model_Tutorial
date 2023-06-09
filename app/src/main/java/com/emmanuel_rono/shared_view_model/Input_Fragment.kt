package com.emmanuel_rono.shared_view_model

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigator
import androidx.navigation.fragment.findNavController
import com.emmanuel_rono.shared_view_model.databinding.ActivityMainBinding
import com.emmanuel_rono.shared_view_model.databinding.FragmentInputBinding

class Input_Fragment : Fragment(R.layout.fragment_input) {

lateinit var binding: FragmentInputBinding
//Give the view binding a scope-Activity scope
private val sharedViewModel:sharedViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding=FragmentInputBinding.bind(view)
        sharedViewModel.Name.observe(viewLifecycleOwner,{ Name -> binding.edName.setText(Name)
    })
        binding.buttonSave.setOnClickListener {
           sharedViewModel.newName(binding.edName.text.toString())
            findNavController().navigate(R.id.action_input_Fragment_to_output_Fragment)
        }
}
}