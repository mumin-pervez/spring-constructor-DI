package com.mumin.beans;

public class Department {

  private int depId;
  private String depName;
  private String depDetails;

  public Department() {
  }

  public Department(int depId, String depName, String depDetails) {
    this.depId = depId;
    this.depName = depName;
    this.depDetails = depDetails;
  }

  @Override
  public String toString() {
    return depName;
  }
}
