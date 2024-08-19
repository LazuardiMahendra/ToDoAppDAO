package com.example.todolistappdao.src.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.todolistappdao.R

public class ToDoListFragmentDirections private constructor() {
  public companion object {
    public fun actionToDoListFragmentToAddTodoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_toDoListFragment_to_addTodoFragment)

    public fun actionToDoListFragmentToDetailTodoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_toDoListFragment_to_detailTodoFragment)

    public fun actionToDoListFragmentToUpdateTodoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_toDoListFragment_to_updateTodoFragment)
  }
}
