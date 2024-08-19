package com.example.todolistappdao.src.data.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.todolistappdao.src.data.entity.TaskEntity
import com.example.todolistappdao.src.data.repository.TaskDataSource
import com.example.todolistappdao.src.data.repository.TaskRepo
import kotlinx.coroutines.launch

class TaskViewModel(private val taskRepo: TaskRepo) : ViewModel() {

    val allTasks: LiveData<List<TaskEntity>> = taskRepo.allTasks.asLiveData()

    fun insertTask(task: TaskEntity) = viewModelScope.launch {
        taskRepo.insertTask(task)
    }
}

class TaskViewModelFactory(private val taskRepo: TaskRepo) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TaskViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TaskViewModel(taskRepo) as T
        }
        throw IllegalArgumentException("Unknown Viewmodel Class")
    }
}
