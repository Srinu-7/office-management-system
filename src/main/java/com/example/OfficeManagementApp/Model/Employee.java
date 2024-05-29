package com.example.OfficeManagementApp.Model;

public class Employee {
    private int empid;
    private int salary;
    private int age;
    private String name;
    private String dept;
    private String gender;

    public Employee(int empid, int salary, int age, String name, String dept, String gender) {
        this.empid = empid;
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.dept = dept;
        this.gender = gender;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
