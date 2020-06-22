/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
package pro.edu.model;

import pro.edu.IBill;

/**
 * IKIN HASANOV's response to Laboratory work 2.
 *   Task:
 *
 *       Topic: Object-oriented programming,  JavaCollectionFramework
 *       Choose a subject according to your number. Develop a service
 *       using all your best in OOP and Java collections.
 *       Six methods must be written like in the following example.
 *                      A point for each one.
 *       Creative approaches are welcome.
 *
 * EXAMPLE
 *
 *  A company contains two types of employees:  full-time and  part-time ones.
 * 1. Create two appropriate classes and 5 objects of each one.
 * 2. Calculate   the total salary of a month.
 * 3. Find the highest salary employee.
 * 4. Find he lowest salary employee
 * 5.  The average salary.
 * 6. Who get more salary, part-time or full-time employees?
 *
 * @version 1.10    22 Jun 2020
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
