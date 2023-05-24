package HomeWork_1;

import java.util.Scanner;

public class Task4 {
    public void calcExpression() {
        double operand1, operand2, result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        operand1 = Double.parseDouble(scanner.next());
        System.out.print("Введите действие: ");
        String operator = scanner.next();
        System.out.print("Введите второе число: ");
        operand2 = Double.parseDouble(scanner.next());
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Ошибка! Действие не определено");
                return;
        }

        System.out.printf("%f %s %f = %f", operand1, operator, operand2, result);
    }
}
