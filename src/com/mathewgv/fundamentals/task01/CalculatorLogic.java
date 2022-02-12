package com.mathewgv.fundamentals.task01;

public class CalculatorLogic {

    public String solve(Task task, CalculatorInput input) {
        switch (task) {
            case TASK1:
                return String.valueOf(performTask1(input));
            case TASK2:
                return String.valueOf(performTask2(input));
            case TASK3:
                double[] values = performTask3(input);
                return values[0] + " " + values[1];
            case TASK4:
                return String.valueOf(performTask4(input));
            default:
                return "Несуществующая задача";
        }
    }

    private boolean performTask1(CalculatorInput input) {
        int fourDigitsNumber = input.enterIntValueFromConsole("Введите четырехзначное число");
        return isFirstDigitsSumEqualsToLastDigitsSum(fourDigitsNumber);
    }

    private double performTask2(CalculatorInput input) {
        double a = input.enterDoubleValueFromConsole("Введите переменную a");
        double b = input.enterDoubleValueFromConsole("Введите переменную b");
        double c = input.enterDoubleValueFromConsole("Введите переменную c");
        return evaluateExpression(a, b, c);
    }

    private double[] performTask3(CalculatorInput input) {
        double cathetus1 = input.enterDoubleValueFromConsole("Введите 1-ый катет");
        double cathetus2 = input.enterDoubleValueFromConsole("Введите 2-ой катет");
        return evaluateTrianglePerimeterAndSquare(cathetus1, cathetus2);
    }

    private boolean performTask4(CalculatorInput input) {
        int x = input.enterIntValueFromConsole("Введите координату x");
        int y = input.enterIntValueFromConsole("Введите координату y");
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
