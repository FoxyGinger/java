package lesson4;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида
 * text:num
 * Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
 * Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class Task1 {
    private static LinkedList<String> strings = new LinkedList<>();

    public static void main(String[] args) {
        while (true){
            run();
        }

    }
    private static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");
        String input = scanner.next();
        String[] data = input.split(":");
        String str = data[0];
        int index = Integer.parseInt(data[1]);
        if (str.equalsIgnoreCase("print")){
            System.out.println(strings.get(index));
            strings.remove(index);
            strings.add(index, null);
        }
        else {
            if (index > strings.size()){
                for (int i = 0; i < index; i++) {
                    strings.add(null);
                }
            }
            strings.add(index, str);
        }
    }
}
