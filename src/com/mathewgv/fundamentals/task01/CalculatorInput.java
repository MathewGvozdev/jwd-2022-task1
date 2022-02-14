package com.mathewgv.fundamentals.task01;

import java.util.Scanner;

public class CalculatorInput {

    @SuppressWarnings("resource")
    private final Scanner scanner = new Scanner(System.in);

    public int enterIntValueFromConsole(String message) {
        System.out.print(message + ":\n> ");
        validateIntValue();
        return readIntValue();
    }

    public double enterDoubleValueFromConsole(String message) {
        System.out.print(message + ":\n> ");
        validateDoubleValue();
        return readDoubleValue();
    }

    private void validateIntValue() {
        while(!scanner.hasNextInt()) {
            scanner.next();
            System.err.println("Некорректный ввод");
        }
    }

    private int readIntValue() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    private void validateDoubleValue() {
        while(!scanner.hasNextDouble()) {
            scanner.next();
            System.err.println("Некорректный ввод");
        }
    }

    private double readDoubleValue() {
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}
