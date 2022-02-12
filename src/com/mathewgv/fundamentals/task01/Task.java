package com.mathewgv.fundamentals.task01;

public enum Task {

    TASK1("""
            Составить линейную программу, печатающую значение true, если указанное высказывание является истинным,
            и false — в противном случае: 
            Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.""",
            "Ответ: %s"),
    TASK2("""
            Вычислить значение выражения по формуле (все переменные принимают действительные значения):
            ((b + sqrt(b^2 + 4ac)) / 2a) - a^3 * c + b^(-2)""",
            "Выражение f = %s"),
    TASK3("""
            Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.""",
            "Периметр: %s\nПлощадь: %s"),
    TASK4("""
            Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
            принадлежит закрашенной области, и false — в противном случае: рис.1.""",
            "Точка принадлежит области: %s");

    private final String taskDescription;
    private final String taskReply;

    Task(String taskDescription, String taskReply) {
        this.taskDescription = taskDescription;
        this.taskReply = taskReply;
    }

    public String getTaskDescription() {
        return this.taskDescription;
    }

    public String getTaskReply() {
        return this.taskReply;
    }
}
