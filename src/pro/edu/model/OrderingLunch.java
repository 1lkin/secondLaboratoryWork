package pro.edu.model;/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
//package ;

import pro.edu.IBill;

/**
 * IKIN HASANOV's response to Homework [x], Module [x].
 *
 *   Task:
 *
 *
 * @version 1.10 [DD] [MMM] [YYYY]
 * @author Ilkin Hasanov
 */
public class OrderingLunch implements IBill {

    private String name;
    private int serving;
    private double price;

    public OrderingLunch() {
    }

    public OrderingLunch(String name, int serving, double price) {
        this.name = name;
        this.serving = serving;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderingLunch{" +
                "name='" + name + '\'' +
                ", serving=" + serving +
                ", price=" + price +
                '}';
    }

    @Override
    public double getBill() {
        return this.getPrice()*getServing();
    }
}
