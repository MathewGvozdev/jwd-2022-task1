package com.mathewgv.fundamentals.task01;

import java.util.Scanner;

public class CalculatorInput {

    @SuppressWarnings("resource")
    private final Scanner scanner = new Scanner(System.in);

    public int enterIntValueFromConsole(String message) {
        System.out.print(message + ":\n> ");
        while(!scanner.hasNextInt()) {
            scanner.next();
            System.err.println("Некорректный ввод");
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public double enterDoubleValueFromConsole(String message) {
        System.out.print(message + ":\n> ");
        while(!scanner.hasNextDouble()) {
            scanner.next();
            System.err.println("Некорректный ввод");
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}
