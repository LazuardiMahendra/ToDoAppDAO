package com.example.todolistappdao.src.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.todolistappdao.src.data.entity.TaskEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    //Get All task
    @Query("SELECT * from tasks")
    fun getAllTask(): Flow<List<TaskEntity>>

    //Get Single Task
//    @Query("SELECT * from tasks WHERE taskId = :taskId")
//    suspend fun getTask(taskId : Int): Flow<TaskEntity>

    //Add New Task
    @Insert
    suspend fun insertTask(taskEntity: TaskEntity)

    //Edit Task
    @Update
    suspend fun updateTask(taskEntity: TaskEntity)

    //Delete Task
    @Delete
    suspend fun deleteTask(user: TaskEntity)
}