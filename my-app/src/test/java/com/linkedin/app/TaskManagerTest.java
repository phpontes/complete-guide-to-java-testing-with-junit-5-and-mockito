package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskManagerTest {

  private TaskManager underTest;
  private Task task;

  @BeforeEach
  void setUp() {
    underTest = new TaskManager();
    task = new Task("Praise the Lord and pass the ammunition");
    assertEquals(0, underTest.count());
  }

  @Test
  public void addTask() {
    underTest.add(task);

    assertTrue(underTest.exists(task.getId()));
    assertEquals(1, underTest.count());
  }

  @Test
  public void addTask_duplicateTask() {
    Task task2 = new Task("Redefine the cosmos");

    underTest.add(task);
    underTest.add(task2);
    assertTrue(underTest.exists(task.getId()));
    assertTrue(underTest.exists(task2.getId()));
    assertEquals(2, underTest.count());
  }

  @Test
  public void removeTask() {
    underTest.add(task);
    int preTaskCount = underTest.count();

    underTest.remove(task.getId());

    assertFalse(underTest.exists(task.getId()));
    assertEquals(preTaskCount - 1, underTest.count());
  }

  @Test
  public void getTask() {
    underTest.add(task);

    Task result = underTest.get(task.getId());

    assertEquals(task, result);
  }
}
