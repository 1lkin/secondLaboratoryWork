package pro.edu;/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
//package ;

import pro.edu.model.OrderingLunch;
import pro.edu.model.StandardLunch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * IKIN HASANOV's response to Homework [x], Module [x].
 *
 *   Task:
 *
 *
 * @version 1.10 [DD] [MMM] [YYYY]
 * @author Ilkin Hasanov
 */
public class Main {
    public static void main(String[] args) {

        StandardLunch meal01 = new StandardLunch("A",82.50);
        StandardLunch meal02 = new StandardLunch("B",55.60);
        StandardLunch meal03 = new StandardLunch("C",112.20);
        StandardLunch meal04 = new StandardLunch("D",64.7);
        StandardLunch meal05 = new StandardLunch("E",95.3);

        OrderingLunch meal06 = new OrderingLunch("F",3,
                27.3);
        OrderingLunch meal07 = new OrderingLunch("G",1,
                26.8);
        OrderingLunch meal08 = new OrderingLunch("H",4,
                35.6);
        OrderingLunch meal09 = new OrderingLunch("I",5,
                40.1);
        OrderingLunch meal10 = new OrderingLunch("J",2,
                32.5);

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

        if (orderingLunch > standardLunch) {
            System.out.println("\"Ordering Lunch\" is expensive than" +
                    " \"Standard Lunch\".");
        } else if (standardLunch > orderingLunch) {
            System.out.println("\"Standard Lunch\" is expensive than" +
                    " \"Ordering Lunch\".");
        } else {
            System.out.println("They are equal.");
        }

// Conclusion

        System.out.println();
    }
}
