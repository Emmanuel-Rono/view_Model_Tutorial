package com.emmanuel_rono.shared_view_model

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.emmanuel_rono.shared_view_model.databinding.FragmentInputBinding

class output_Fragment : Fragment(R.layout.fragment_output) {
    lateinit var binding: FragmentInputBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInputBinding.bind(view)

    }
}
