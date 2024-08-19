package com.example.todolistappdao.src.data.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/todolistappdao/src/data/viewmodel/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepo", "Lcom/example/todolistappdao/src/data/repository/TaskRepo;", "(Lcom/example/todolistappdao/src/data/repository/TaskRepo;)V", "allTasks", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/todolistappdao/src/data/entity/TaskEntity;", "getAllTasks", "()Landroidx/lifecycle/LiveData;", "insertTask", "Lkotlinx/coroutines/Job;", "task", "app_debug"})
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.todolistappdao.src.data.repository.TaskRepo taskRepo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.todolistappdao.src.data.entity.TaskEntity>> allTasks = null;
    
    public TaskViewModel(@org.jetbrains.annotations.NotNull
    com.example.todolistappdao.src.data.repository.TaskRepo taskRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todolistappdao.src.data.entity.TaskEntity>> getAllTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertTask(@org.jetbrains.annotations.NotNull
    com.example.todolistappdao.src.data.entity.TaskEntity task) {
        return null;
    }
}