package com.example.todolistappdao.src

import android.app.Application
import com.example.todolistappdao.src.data.database.AppDatabase
import com.example.todolistappdao.src.data.repository.TaskRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class TaskApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { AppDatabase.getDatabase(this, applicationScope) }
    val taskRepo by lazy { TaskRepo(database.todoDao()) }
}