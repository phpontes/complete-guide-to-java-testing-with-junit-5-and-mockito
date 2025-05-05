package com.linkedin.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutTest {

  @Test
  @Timeout(5)
  void methodWithTimeout() throws InterruptedException {
    // Perform test logic that should complete within 5 seconds
    Thread.sleep(4000); // Simulating a lengthy operation
  }
}