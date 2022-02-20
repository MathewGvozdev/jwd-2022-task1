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

    public int enterFourDigitsNumberFromConsole(String message) {
        System.out.print(message + ":\n> ");
        String value = scanner.nextLine();
        try {
            while (!isFourDigitNumber(value)) {
                System.err.println("Некорректный ввод");
                value = scanner.nextLine();
            }
        } catch (NumberFormatException e) {
            System.err.println("Некорректный ввод");
        }
        return Integer.parseInt(value);
    }

    private void validateFourDigitsNumber() {
        var value = scanner.next();
        while (!scanner.hasNextInt() && isFourDigitNumber(value)) {
            System.err.println("Некорректный ввод. Введите четырехзначное число");
            value = scanner.next();
        }
    }

    private boolean isFourDigitNumber(String value) {
        return Integer.parseInt(value) >= 1000 && Integer.parseInt(value) <= 9999;
    }

    private void validateIntValue() {
        while (!scanner.hasNextInt()) {
            System.err.println("Некорректный ввод");
            scanner.next();
        }
    }

    private int readIntValue() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    private void validateDoubleValue() {
        while (!scanner.hasNextDouble()) {
            System.err.println("Некорректный ввод");
            scanner.next();
        }
    }

    private double readDoubleValue() {
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}
