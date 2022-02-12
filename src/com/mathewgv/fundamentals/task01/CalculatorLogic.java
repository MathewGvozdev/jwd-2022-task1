package com.mathewgv.fundamentals.task01;

public class CalculatorLogic {

    public boolean performTask1(int fourDigitsNumber) {
        return isFirstDigitsSumEqualsToLastDigitsSum(fourDigitsNumber);
    }

    public double performTask2(double a, double b, double c) {
        return evaluateExpression(a, b, c);
    }

    public double[] performTask3(double cathetus1, double cathetus2) {
        return evaluateTrianglePerimeterAndSquare(cathetus1, cathetus2);
    }

    public boolean performTask4(int x, int y) {
        return isPointInShadedArea(x, y);
    }

    private boolean isFirstDigitsSumEqualsToLastDigitsSum(int value) {
        int[] valueNumbers = new int[4];
        int divider = 1000;
        if (value / divider == 0 && value / divider >= 9) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < valueNumbers.length; ++i) {
            valueNumbers[i] = value / divider;
            value %= divider;
            divider /= 10;
        }
        return valueNumbers[0] + valueNumbers[1] == valueNumbers[2] + valueNumbers[3];
    }

    private double evaluateExpression(double a, double b, double c) {
        return (b + Math.sqrt(b*b + 4*a*c)) / (2*a) - a*a*a*c + Math.pow(b, -2);
    }

    private double[] evaluateTrianglePerimeterAndSquare(double a, double b) {
        double hyp = Math.sqrt(a*a + b*b);
        double perimeter = a + b + hyp;
        double square = 0.5 * a * b;
        return new double[] {perimeter, square};
    }

    private boolean isPointInShadedArea(int x, int y) {
        return ((x <= 4 && x >= -4) && (y <= 0 && y >= -3)) || ((x <= 2 && x >= -2) && (y >= 0 && y <= 4));
    }
}
