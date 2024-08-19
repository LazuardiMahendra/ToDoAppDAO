package com.example.todolistappdao.src.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.todolistappdao.R
import com.example.todolistappdao.src.data.entity.TaskEntity
import com.example.todolistappdao.src.data.viewmodel.TaskViewModel

class ToDoListAdapter : ListAdapter<TaskEntity,ToDoListAdapter.TaskViewHolder >(TasksComparator()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current.title)
    }


    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val taskItemView: TextView = itemView.findViewById(R.id.tv_titte)

        fun bind(text: String?) {
            taskItemView.text = text
        }

        companion object {
            fun create(parent: ViewGroup): TaskViewHolder {
                val view: View = LayoutInflater.from(parent.context)
                    .inflate(R.layout.view_list_todo, parent, false)
                return TaskViewHolder(view)
            }
        }
    }

    class TasksComparator : DiffUtil.ItemCallback<TaskEntity>() {
        override fun areItemsTheSame(oldItem: TaskEntity, newItem: TaskEntity): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: TaskEntity, newItem: TaskEntity): Boolean {
            return oldItem == newItem

        }
    }


}