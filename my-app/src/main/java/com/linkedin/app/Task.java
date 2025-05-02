package com.linkedin.app;

public class Task {

  private Integer id;
  private static int counter = 0;

  public Task() {
    this.id = counter++;
  }

  public Integer getId() {
    return id;
  }
}
