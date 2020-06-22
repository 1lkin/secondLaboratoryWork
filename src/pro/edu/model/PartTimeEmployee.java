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
public class PartTimeEmployee implements IAccounting {

    private String name;
    private double rate;
    private int hours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    @Override
    public int getSalary() {
        return (int) (this.getHours() * this.getRate());
    }
}
