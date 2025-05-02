package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TaskTest {

  @Test
  public void getId() {
    Task task = new Task("Fill a bottle with a handful of sunlight");
    assertNotNull(task.getId());
  }

  @Test
  public void getDescription() {
    Task task = new Task("Feel the grass");
    String result = task.getDescription();
    assertEquals("Feel the grass", result);
  }
}
