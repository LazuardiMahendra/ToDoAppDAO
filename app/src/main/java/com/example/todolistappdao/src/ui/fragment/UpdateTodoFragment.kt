package com.example.todolistappdao.src.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todolistappdao.R
import com.example.todolistappdao.databinding.FragmentDetailTodoBinding
import com.example.todolistappdao.databinding.FragmentUpdateTodoBinding

class UpdateTodoFragment : Fragment() {
    private var _binding : FragmentUpdateTodoBinding? = null;
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUpdateTodoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}