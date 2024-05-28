package com.example.OfficeManagementApp;

public class Manager {
    private int id;
    private int salary;
    private int age;
    private int reportees;
    private String name;
    private String superior;

    public Manager(int id, int salary, int age, int reportees, String name, String superior) {
        this.id = id;
        this.salary = salary;
        this.age = age;
        this.reportees = reportees;
        this.name = name;
        this.superior = superior;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getReportees() {
        return reportees;
    }

    public void setReportees(int reportees) {
        this.reportees = reportees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }
}
