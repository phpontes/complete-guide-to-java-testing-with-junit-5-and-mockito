package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class TimeConsumingTaskTest {
  
  @Test
  public void performTaskCompletesWithinTimeLimit() {
    TimeConsumingTask task = new TimeConsumingTask();
    assertTimeout(Duration.ofSeconds(3), task::performTask, "Task took longer than expected");
  }
}
