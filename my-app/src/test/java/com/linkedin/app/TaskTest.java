package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TaskTest {

  @Test
  public void getId() {
    Task task = new Task();
    assertNotNull(task.getId());
  }
}
