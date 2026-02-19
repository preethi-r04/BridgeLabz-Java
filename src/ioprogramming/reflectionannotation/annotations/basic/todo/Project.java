package ioprogramming.reflectionannotation.annotations.basic.todo;

public class Project {

    @Todo(task = "Add login", assignedTo = "Dev1")
    public void login() {}

    @Todo(task = "Add dashboard", assignedTo = "Dev2", priority = "HIGH")
    public void dashboard() {}
}
