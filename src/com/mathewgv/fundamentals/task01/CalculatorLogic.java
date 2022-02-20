package com.mathewgv.fundamentals.task01;

public class CalculatorLogic {

    public boolean performTask1(int fourDigitsNumber) {
        return isFirstDigitsSumEqualsToLastDigitsSum(fourDigitsNumber);
    }

    public double performTask2(double a, double b, double c) {
        return evaluateExpression(a, b, c);
    }

    public double[] performTask3(double cathetus1, double cathetus2) {
        double perimeter = evaluateTrianglePerimeter(cathetus1, cathetus2);
        double square = evaluateTriangleSquare(cathetus1, cathetus2);
        return new double[]{perimeter, square};
    }

    public boolean performTask4(int x, int y) {
        return isPointInShadedArea(x, y);
    }

    private boolean isFirstDigitsSumEqualsToLastDigitsSum(int value) {
        int[] digits = splitToDigits(value);
        return digits[0] + digits[1] == digits[2] + digits[3];
    }

    private int[] splitToDigits(int value) {
        int[] valueNumbers = new int[4];
        int divider = 1000;
        for (int i = 0; i < valueNumbers.length; ++i) {
            valueNumbers[i] = value / divider;
            value %= divider;
            divider /= 10;
        }
        return valueNumbers;
    }

    private double evaluateExpression(double a, double b, double c) {
        return (b + Math.sqrt(b*b + 4*a*c)) / (2*a) - a*a*a*c + Math.pow(b, -2);
    }

    private double evaluateTrianglePerimeter(double a, double b) {
        double hyp = Math.sqrt(a*a + b*b);
        return a + b + hyp;
    }

    private double evaluateTriangleSquare(double a, double b) {
        return 0.5 * a * b;
    }

    private boolean isPointInShadedArea(int x, int y) {
        return ((x <= 4 && x >= -4) && (y <= 0 && y >= -3)) || ((x <= 2 && x >= -2) && (y >= 0 && y <= 4));
    }
}
