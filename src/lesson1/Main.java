package lesson1;

import lesson1.task1.Task1;
import lesson1.task1.Task2;
import lesson1.task1.Task3;
import lesson1.task1.TaskLess_1;


import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1");
        System.out.println("Введите Число");
        int number1 = scanner.nextInt();
        System.out.println(TaskLess_1.arithmeticProgression(number1));
        System.out.println("Задача 2");
        System.out.println("Введите Число для фактроила: ");
        int number2 = scanner.nextInt();
        System.out.println(TaskLess_1.factorial(number2));
        System.out.println("Задача 3");
        TaskLess_1.printPrimeNumbers(1000);

        System.out.println("Задача 4");
        System.out.print("Введите Число 1: ");
        double a = scanner.nextDouble();
        System.out.print("Введите Число 2: ");
        double b = scanner.nextDouble();
        System.out.print("Введите что будем делать (+, -, *, /): ");
        char point = scanner.next().charAt(0);
        System.out.println(TaskLess_1.calc(a, b, point));

        scanner.close();

    }
}
