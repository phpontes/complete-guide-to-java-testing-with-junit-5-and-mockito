package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskTest {

  @Test
  public void getId() {
    Task task = new Task(3);
    assertEquals(3, task.getId());
  }
}
