package com.example.todolistappdao.src.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/todolistappdao/src/data/repository/TaskRepo;", "", "taskDao", "Lcom/example/todolistappdao/src/data/dao/TaskDao;", "(Lcom/example/todolistappdao/src/data/dao/TaskDao;)V", "allTasks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/todolistappdao/src/data/entity/TaskEntity;", "getAllTasks", "()Lkotlinx/coroutines/flow/Flow;", "deleteTask", "", "taskEntity", "(Lcom/example/todolistappdao/src/data/entity/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTask", "updateTask", "app_debug"})
public final class TaskRepo {
    @org.jetbrains.annotations.NotNull
    private final com.example.todolistappdao.src.data.dao.TaskDao taskDao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolistappdao.src.data.entity.TaskEntity>> allTasks = null;
    
    public TaskRepo(@org.jetbrains.annotations.NotNull
    com.example.todolistappdao.src.data.dao.TaskDao taskDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolistappdao.src.data.entity.TaskEntity>> getAllTasks() {
        return null;
    }
    
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertTask(@org.jetbrains.annotations.NotNull
    com.example.todolistappdao.src.data.entity.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateTask(@org.jetbrains.annotations.NotNull
    com.example.todolistappdao.src.data.entity.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.todolistappdao.src.data.entity.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}