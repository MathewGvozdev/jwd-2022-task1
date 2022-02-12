package com.mathewgv.fundamentals.task01;

public class CalculatorView {

    public void print(Task task, String result) {
        String format;
        if (task == Task.TASK3) {
            String[] perimeterAndSquare = result.split(" ");
            String perimeter = perimeterAndSquare[0];
            String square = perimeterAndSquare[1];
            format = String.format(task.getTaskReply(), perimeter, square);
        } else {
            format = String.format(task.getTaskReply(), result);
        }
        System.out.println(format);
        System.out.println();
    }

    public void printTaskDescription(Task task) {
        System.out.println(task.getTaskDescription());
    }
}
