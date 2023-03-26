package lesson2;


import lesson2.homework.Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 22,13,53,12,56};
        System.out.println(Arrays.toString(Task1.bubbleSort(arr)));
    }
}
