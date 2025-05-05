package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  void add() {
    Calculator calculator = new Calculator();
    int result = calculator.add(2, 3);

    assertEquals(5, result, () -> "Expected 5 but got " + result);
  }
}
