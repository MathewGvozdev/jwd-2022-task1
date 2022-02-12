package com.mathewgv.fundamentals.task01;

public class CalculatorController {

    private final CalculatorInput input = new CalculatorInput();
    private final CalculatorLogic logic = new CalculatorLogic();
    private final CalculatorView view = new CalculatorView();

    public void execute(Task task) {
        view.printTaskDescription(task);
        String result = logic.solve(task, input);
        view.print(task, result);
    }
}
