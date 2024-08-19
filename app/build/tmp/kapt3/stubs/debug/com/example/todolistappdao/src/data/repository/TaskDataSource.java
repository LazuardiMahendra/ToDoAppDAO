package com.example.todolistappdao.src.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/todolistappdao/src/data/repository/TaskDataSource;", "", "deleteTask", "", "taskEntity", "Lcom/example/todolistappdao/src/data/entity/TaskEntity;", "(Lcom/example/todolistappdao/src/data/entity/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTask", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTask", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTask", "updateTask", "app_debug"})
public abstract interface TaskDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllTask(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.example.todolistappdao.src.data.entity.TaskEntity>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTask(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.todolistappdao.src.data.entity.TaskEntity>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertTask(@org.jetbrains.annotations.NotNull
    com.example.todolistappdao.src.data.entity.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTask(@org.jetbrains.annotations.NotNull
    com.example.todolistappdao.src.data.entity.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.todolistappdao.src.data.entity.TaskEntity taskEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}