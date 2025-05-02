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

  @Test
  public void setDescription() {
    Task task = new Task("Pack for hunt");
    task.setDescription("Pack guns and ammo");
    assertEquals("Pack guns and ammo", task.getDescription());
  }
}
