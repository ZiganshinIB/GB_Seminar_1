package lesson4.task;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public ArrayList<Integer> getArray() {
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNext()) {
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
                // использование введенных данных
            } else {
                System.out.println("Пустые значении");
            }




        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
