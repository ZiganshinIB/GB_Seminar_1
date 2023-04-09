package lesson4.task;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RandomArray ra = new RandomArray();

        ArrayList<Integer> newFirstArray = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        newFirstArray = getArray(sc);
        System.out.println("Первый рабочий массив: ");
        System.out.println(newFirstArray);

        ArrayList<Integer> newSecondArray = new ArrayList<>();
        newSecondArray = getArray(sc);
        System.out.println("Второй рабочий массив: ");
        System.out.println(newSecondArray);
        System.out.println("Первый, помним, такой: ");
        System.out.println(newFirstArray);

        Task4.differenceOfArrays(newFirstArray, newSecondArray);

        Task4.symmetricArrayDiff(newFirstArray, newSecondArray);
        sc.close();

    }

    public static ArrayList<Integer> getArray(Scanner sc) {
        System.out.print("Введите длину массива N: ");
        int n = sc.nextInt();
        System.out.print("Введите максимальное значение массива: ");
        int max = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            array.add(i, r.nextInt(max + 1));
        }
        return (array);
    }

}