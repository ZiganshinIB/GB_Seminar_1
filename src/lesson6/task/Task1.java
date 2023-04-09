package lesson6.task;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        arr = fillArray(arr);
        printArr(arr, 20);
        var integerSet = fillSetInteger(arr);
        System.out.println("Set: " + integerSet);
        double persent = integerSet.size() * 100/ arr.length;
        System.out.println("Persent: " + persent);



    }

    public static Integer[] fillArray(Integer[] arr){
        Random random = new Random();
        var arr2 = arr.clone();
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = random.nextInt(25);
        return arr2;
    }

    public static void printArr(Integer[] arr , int n){
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static Set<Integer> fillSetInteger(Integer[] array){
        return Arrays.stream(array).collect(Collectors.toSet());
    }
}
