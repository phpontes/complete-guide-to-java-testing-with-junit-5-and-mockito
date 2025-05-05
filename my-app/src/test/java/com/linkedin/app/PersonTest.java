package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
  
  @Test
  public void personFields() {
    Person person = new Person("José das Couves", 77, "jose.couveiro@rocketmail.com", "Rua dos Bobos, 0");
    assertAll("Person fields",
      () -> assertEquals("José das Couves", person.getName()),
      () -> assertEquals(77, person.getAge()),
      () -> assertEquals("jose.couveiro@rocketmail.com", person.getEmail()),
      () -> assertEquals("Rua dos Bobos, 0", person.getAddress())
    );
  }
}
