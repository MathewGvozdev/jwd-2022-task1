package com.mathewgv.fundamentals.task01;

import java.util.Arrays;

public class CalculatorView {

    public void print(Task task, String result) {
        System.out.println(selectFormatForTask(task, result));
        System.out.println();
    }

    private String selectFormatForTask(Task task, String result) {
        String format;
        if (task == Task.TASK3) {
            String[] perimeterAndSquare = splitResultToDesiredValues(result);
            String perimeter = getPerimeterFromResult(perimeterAndSquare);
            String square = getSquareFromResult(perimeterAndSquare);
            format = String.format(task.getTaskReply(), perimeter, square);
        } else {
            format = String.format(task.getTaskReply(), result);
        }
        return format;
    }

    private String[] splitResultToDesiredValues(String result) {
        return result.split(" ");
    }

    private String getPerimeterFromResult(String[] perimeterAndSquare) {
        return perimeterAndSquare[0];
    }

    private String getSquareFromResult(String[] perimeterAndSquare) {
        return perimeterAndSquare[1];
    }

    public void printTaskDescription(Task task) {
        System.out.println(task.getTaskDescription());
    }

    public String convertArrayToString(double[] results) {
        String arr = Arrays.toString(results);
        var temp = arr.replace("[", "").replace("]", "");
        arr = temp.replace(", ", " ");
        return arr;
    }

    public String convertToString(double result) {
        return String.valueOf(result);
    }

    public String convertToString(boolean result) {
        return String.valueOf(result);
    }
}
