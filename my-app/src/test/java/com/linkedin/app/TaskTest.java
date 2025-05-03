package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskTest {

  private static Task underTest;
  private static final String DESCRIPTION = "Live like it's 2004 again";

  @BeforeEach
  public void setUp() {
    underTest = new Task(DESCRIPTION);
  }

  @Test
  public void getId() {
    assertNotNull(underTest.getId());
  }

  @Test
  public void getDescription() {
    String result = underTest.getDescription();
    assertEquals(DESCRIPTION, result);
  }

  @Test
  public void setDescription() {
    underTest.setDescription(DESCRIPTION + " maybe next month");
    assertEquals(DESCRIPTION + " maybe next month", underTest.getDescription());
  }
}
