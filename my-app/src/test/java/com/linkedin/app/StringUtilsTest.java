package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringUtilsTest {

  @ParameterizedTest
  @ValueSource(strings = { "", "a", "racecar", "RaceCar" })
  public void isPalindrome(String str) {
    assertTrue(StringUtils.isPalindrome(str));
  }

  @ParameterizedTest
  @ValueSource(strings = { "hello", "world", "java", "JUnit" })
  public void isNotPalindrome(String str) {
    assertFalse(StringUtils.isPalindrome(str));
  }
}