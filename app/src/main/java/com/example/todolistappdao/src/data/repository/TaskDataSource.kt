package com.example.todolistappdao.src.data.repository

import com.example.todolistappdao.src.data.entity.TaskEntity
import kotlinx.coroutines.flow.Flow

interface TaskDataSource {

    suspend fun getAllTask(): Flow<List<TaskEntity>>

    suspend fun getTask(id : Int): Flow<TaskEntity>

    suspend fun insertTask(taskEntity: TaskEntity)

    suspend fun updateTask(taskEntity: TaskEntity)

    suspend fun deleteTask(taskEntity: TaskEntity)

}