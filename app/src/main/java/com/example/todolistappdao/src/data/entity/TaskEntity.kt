package com.example.todolistappdao.src.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey @ColumnInfo(name = "task")    val title: String,

//    val taskId: Int = 0,
//    val description: String
)
