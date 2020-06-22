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
public class StandardLunch implements IBill {

    private String name;
    private double price;

    public StandardLunch() {
    }

    public StandardLunch(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "StandardLunch{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double getBill() {
        return this.getPrice();
    }
}
