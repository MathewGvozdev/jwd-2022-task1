package com.mathewgv.fundamentals.task01;

public class CalculatorRunner {

    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        controller.execute(Task.TASK1);
        controller.execute(Task.TASK2);
        controller.execute(Task.TASK3);
        controller.execute(Task.TASK4);
    }
}
