/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
package pro.edu;

import pro.edu.model.OrderingLunch;
import pro.edu.model.StandardLunch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
public class Main {
    public static void main(String[] args) {

        StandardLunch meal01 = new StandardLunch("A",82.50);
        StandardLunch meal02 = new StandardLunch("B",55.60);
        StandardLunch meal03 = new StandardLunch("C",112.20);
        StandardLunch meal04 = new StandardLunch("D",64.70);
        StandardLunch meal05 = new StandardLunch("E",95.30);

        OrderingLunch meal06 = new OrderingLunch("F",1,
                27.30);
        OrderingLunch meal07 = new OrderingLunch("G",1,
                26.80);
        OrderingLunch meal08 = new OrderingLunch("H",1,
                35.60);
        OrderingLunch meal09 = new OrderingLunch("I",1,
                40.30);
        OrderingLunch meal10 = new OrderingLunch("J",1,
                32.70);

        List<IBill> menu = new ArrayList<>();
        menu.add(meal01);
        menu.add(meal02);
        menu.add(meal03);
        menu.add(meal04);
        menu.add(meal05);

        menu.add(meal06);
        menu.add(meal07);
        menu.add(meal08);
        menu.add(meal09);
        menu.add(meal10);

// Calculate total price of all meals

        double totalPrice = menu.stream().mapToDouble(IBill::getBill).sum();

// Find highest price

        IBill highestPrice = menu.stream()
                .max(Comparator.comparingDouble(IBill::getBill))
                .orElse(null);

// Find lowest price

        IBill lowestPrice = menu.stream()
                .min(Comparator.comparingDouble(IBill::getBill))
                .orElse(null);

// The average price of meals

        double averagePrice = menu.stream().mapToDouble(IBill::getBill)
                .average().orElse(0);

// Which type of lunch is more expensive

        double orderingLunch = menu.stream()
                .filter(el -> el instanceof OrderingLunch)
                .mapToDouble(IBill::getBill).sum();

        double standardLunch = menu.stream()
                .filter(el -> el instanceof StandardLunch)
                .mapToDouble(IBill::getBill).sum();

        String expensiveType;
        if (orderingLunch > standardLunch) {
            expensiveType = "Ordering Lunch";
        } else if (standardLunch > orderingLunch) {
            expensiveType = "Standard Lunch";
        } else {
            expensiveType = "They are similar";
        }

// Conclusion

        System.out.println("Total price of all meals are: " + totalPrice +
                ",\nhighest price is: " + highestPrice +
                ",\nlowest price is: " + lowestPrice +
                ",\nThe average price of meals is: " + averagePrice +
                ",\nMore expensive lunch type is: " + expensiveType + ".");
    }
}
