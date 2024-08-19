package com.example.todolistappdao.src.data.repository

import androidx.annotation.WorkerThread
import com.example.todolistappdao.src.data.dao.TaskDao
import com.example.todolistappdao.src.data.entity.TaskEntity
import kotlinx.coroutines.flow.Flow

class TaskRepo(private val taskDao: TaskDao) {

    val allTasks: Flow<List<TaskEntity>> = taskDao.getAllTask()

//    @Suppress("RedundantSuspendModifier")
//    @WorkerThread
//    suspend fun getTask(taskId: Int) {
//        taskDao.getTask(taskId)
//    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertTask(taskEntity: TaskEntity) {
        taskDao.insertTask(taskEntity)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun updateTask(taskEntity: TaskEntity) {
        taskDao.updateTask(taskEntity)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteTask(taskEntity: TaskEntity) {
        taskDao.deleteTask(taskEntity)
    }


}