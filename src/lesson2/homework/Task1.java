package lesson2.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {
    private static StringBuilder str = new StringBuilder("");
    public static int[] bubbleSort(int[] arr){
        remove();
        for (int i = 0; i < arr.length; i++){
            stepBubbleSort(arr, i);
            write();
        }
        return arr;
    }
    private static void stepBubbleSort(int[] arr, int offset){
        for (int i = 0; i < arr.length-1-offset; i++){
            if (arr[i] > arr[i+1]) swapArr(arr, i);
            write(arr);
        }
    }

    private static void swapArr(int[] arr, int index){
        int a = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = a;
    }

    private static void write(int[] array){
        try (FileWriter inFile = new FileWriter("sort.txt", true)){
            inFile.append(Arrays.toString(array)).append("\n");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void write(){
        try (FileWriter inFile = new FileWriter("sort.txt", true)){
            inFile.append("\n");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void remove(){
        try (FileWriter inFile = new FileWriter("sort.txt")){
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
