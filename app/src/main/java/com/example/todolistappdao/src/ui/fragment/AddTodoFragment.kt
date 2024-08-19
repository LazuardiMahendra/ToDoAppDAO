package com.example.todolistappdao.src.ui.fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.todolistappdao.src.data.database.AppDatabase
import com.example.todolistappdao.databinding.FragmentAddTodoBinding
import com.example.todolistappdao.src.TaskApplication
import com.example.todolistappdao.src.data.entity.TaskEntity
import com.example.todolistappdao.src.data.viewmodel.TaskViewModel
import com.example.todolistappdao.src.data.viewmodel.TaskViewModelFactory


class AddTodoFragment : Fragment() {
    private var _binding: FragmentAddTodoBinding? = null;
    private val binding get() = _binding!!

    private val taskViewModel: TaskViewModel by viewModels {
        TaskViewModelFactory((requireActivity().application as TaskApplication).taskRepo)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddTodoBinding.inflate(inflater, container, false)

        binding.btnSave.setOnClickListener {
            if (binding.etTitle.text.toString().isEmpty() || binding.etDesc.text.toString()
                    .isEmpty()
            ) {
                Toast.makeText(requireContext(), "Textfield is empty", Toast.LENGTH_SHORT)
                    .show()

            } else {
                val title = binding.etTitle.text.toString()
                taskViewModel.insertTask(TaskEntity(title))
//                findNavController().previousBackStackEntry?.savedStateHandle?.set("newToDo", title)


            }
            findNavController().popBackStack()

        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }


}