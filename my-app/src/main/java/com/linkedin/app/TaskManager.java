package com.linkedin.app;

import java.util.HashMap;
import java.util.Map;

public class TaskManager {

  private Map<Integer, Task> tasks;

  public TaskManager() {
    this.tasks = new HashMap<>();
  }

  public void add(Task task) {
    tasks.put(task.getId(), task);
  }

  public boolean exists(int taskId) {
    return tasks.containsKey(taskId);
  }

}
