package lesson1;

import lesson1.task1.Task1;
import lesson1.task1.Task2;
import lesson1.task1.Task3;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,1, 1,0, 1, 1,1, 0, 1, 1};
        System.out.println(Task3.getMaxOneCount(array));
    }
}
