package com.linkedin.app;

public class Task {

  private Integer id;
  private String description;
  private static int counter = 0;

  public Task(String description) {
    this.id = counter++;
    this.description = description;
  }

  public Integer getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
