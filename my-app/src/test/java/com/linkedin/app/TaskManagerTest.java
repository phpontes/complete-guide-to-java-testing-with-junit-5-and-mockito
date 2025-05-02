package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TaskManagerTest {

  @Test
  public void addTask() {
    TaskManager taskManager = new TaskManager();
    Task task = new Task();

    taskManager.add(task);

    assertTrue(taskManager.exists(task.getId()));
  }
}
