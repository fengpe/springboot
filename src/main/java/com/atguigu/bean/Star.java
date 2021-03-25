package com.atguigu.bean;

import org.springframework.stereotype.Component;


public class Star {
    private String name;
    private Integer id;
    private double salary;

    public Star(String name, Integer id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Star() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
