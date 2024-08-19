package com.example.todolistappdao.src.ui.fragment

import android.app.Activity
import android.app.FragmentTransaction
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.ui.window.application
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolistappdao.R
import com.example.todolistappdao.databinding.FragmentToDoListBinding
import com.example.todolistappdao.src.TaskApplication
import com.example.todolistappdao.src.data.entity.TaskEntity
import com.example.todolistappdao.src.data.viewmodel.TaskViewModel
import com.example.todolistappdao.src.data.viewmodel.TaskViewModelFactory
import com.example.todolistappdao.src.ui.adapter.ToDoListAdapter


class ToDoListFragment : Fragment() {

    private var _binding: FragmentToDoListBinding? = null;
    private val binding get() = _binding!!

    private val taskViewModel: TaskViewModel by viewModels {
        TaskViewModelFactory((requireActivity().application as TaskApplication).taskRepo)
    }
    private val newTaskAActivityRequestCode = "newTodo"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentToDoListBinding.inflate(inflater, container, false)

        val recyclerView = binding.rvTodo
        val adapter = ToDoListAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        taskViewModel.allTasks.observe(requireActivity()) { tasks ->
            if (tasks != null) {
                tasks.let { adapter.submitList(it) }
                binding.ivEmpty.visibility = View.GONE
                binding.tvEmpty.visibility = View.GONE
            }
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.fabAdd.setOnClickListener {
            findNavController().navigate(ToDoListFragmentDirections.actionToDoListFragmentToAddTodoFragment())
        }

//        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("newToDo")
//            ?.observe(viewLifecycleOwner) { result ->
//                val task = TaskEntity(result)
//                Log.d("TAG", "Task :  $result")
//                taskViewModel.insertTask(task)
//            }


    }


//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (resultCode == newTaskAActivityRequestCode && resultCode == Activity.RESULT_OK) {
//            data?.getStringExtra(AddTodoFragment.EXTRA_REPLY)?.let { reply ->
//                val task = TaskEntity(reply)
//                taskViewModel.insertTask(task)
//            }
//        } else {
//            Toast.makeText(
//                requireContext(), "not saved", Toast.LENGTH_LONG
//            ).show()
//        }
//    }

}