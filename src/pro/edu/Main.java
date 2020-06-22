package pro.edu; /**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
//package ;

import pro.edu.model.FullTimeEmployee;
import pro.edu.model.PartTimeEmployee;

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
        FullTimeEmployee f1 = new FullTimeEmployee("f1",7000);
        FullTimeEmployee f2 = new FullTimeEmployee("f2",6000);
        FullTimeEmployee f3 = new FullTimeEmployee("f3",4000);
        FullTimeEmployee f4 = new FullTimeEmployee("f4",5500);
        FullTimeEmployee f5 = new FullTimeEmployee("f5",4800);

        PartTimeEmployee designer = new PartTimeEmployee("designer",25,150);
        PartTimeEmployee tester = new PartTimeEmployee("tester",35,176);
        PartTimeEmployee backEnd = new PartTimeEmployee("backEnd",50,200);
        PartTimeEmployee gui = new PartTimeEmployee("gui",38,200);
        PartTimeEmployee devops = new PartTimeEmployee("admin",48,176);

        List<IAccounting> employees = new ArrayList<>();
        employees.add(f1);
        employees.add(f2);
        employees.add(f3);
        employees.add(f4);
        employees.add(f5);

        employees.add(designer);
        employees.add(tester);
        employees.add(backEnd);
        employees.add(gui);
        employees.add(devops);

// Calculate total salary

        int salary = employees.stream().mapToInt(IAccounting::getSalary).sum();

// Find the highest salary employee

        IAccounting highestSalaryMan = employees.stream()
                .max(Comparator.comparingInt(IAccounting::getSalary)).
                        orElse(null);

// Find the lowest salary employee

        IAccounting lowestSalaryMan = employees.stream()
                .min(Comparator.comparingInt(IAccounting::getSalary)).
                        orElse(null);

// The average salary

        double avg = employees.stream().mapToInt(IAccounting::getSalary)
                .average().orElse(0);

// Who get more salary, part-time employee or full-time employee

        int partTimeSalary = employees.stream().filter(el -> el instanceof PartTimeEmployee)
                .mapToInt(IAccounting::getSalary).sum();

        int fullTimeSalary = employees.stream().filter(el -> el instanceof PartTimeEmployee)
                .mapToInt(IAccounting::getSalary).sum();

        if (partTimeSalary > fullTimeSalary) {
            System.out.println("Part time workers get greater salary than full-timers.");
        } else if (fullTimeSalary > partTimeSalary) {
            System.out.println("Full-time workers get greater salary than part timers.");
        } else {
            System.out.println("They are equal.");
        }

    }
}
