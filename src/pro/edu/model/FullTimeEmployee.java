package pro.edu.model;/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
//package ;

import pro.edu.IAccounting;

/**
 * IKIN HASANOV's response to Homework [x], Module [x].
 *
 *   Task:
 *
 *
 * @version 1.10 [DD] [MMM] [YYYY]
 * @author Ilkin Hasanov
 */
public class FullTimeEmployee implements IAccounting {

    private String name;
    private int monthlySalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + name + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }

    @Override
    public int getSalary() {
        return this.getMonthlySalary();
    }
}
