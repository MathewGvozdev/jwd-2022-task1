package com.mathewgv.fundamentals.task01;

public class CalculatorController {

    private final CalculatorInput input = new CalculatorInput();
    private final CalculatorLogic logic = new CalculatorLogic();
    private final CalculatorView view = new CalculatorView();

    public void execute(Task task) {
        view.printTaskDescription(task);
        String solution = selectSolution(task);
        view.print(task, solution);
    }

    private String selectSolution(Task task) {
        switch (task) {
            case TASK1:
                int fourDigitsNumber = input.enterFourDigitsNumberFromConsole("Введите четырехзначное число");
                return view.convertToString(logic.performTask1(fourDigitsNumber));
            case TASK2:
                double a = input.enterDoubleValueFromConsole("Введите переменную a");
                double b = input.enterDoubleValueFromConsole("Введите переменную b");
                double c = input.enterDoubleValueFromConsole("Введите переменную c");
                return view.convertToString(logic.performTask2(a, b, c));
            case TASK3:
                double cathetus1 = input.enterDoubleValueFromConsole("Введите 1-ый катет");
                double cathetus2 = input.enterDoubleValueFromConsole("Введите 2-ой катет");
                return view.convertArrayToString(logic.performTask3(cathetus1, cathetus2));
            case TASK4:
                int x = input.enterIntValueFromConsole("Введите координату x");
                int y = input.enterIntValueFromConsole("Введите координату y");
                return view.convertToString(logic.performTask4(x, y));
            default:
                return "Несуществующая задача";
        }
    }
}
