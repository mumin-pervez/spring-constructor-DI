package com.mumin.beans;

public class Employee {

  private int empId;
  private String empName;
  private Department department;

  public Employee(int empId, String empName, Department department) {
    this.empId = empId;
    this.empName = empName;
    this.department = department;
  }

  public void displayInfo() {
    System.out.println("Id : " + empId);
    System.out.println("Name : " + empName);
    System.out.println("Department : " + department);
  }
}
