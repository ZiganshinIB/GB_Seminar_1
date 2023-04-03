package lesson3.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.IntStream;

public class ListInfo {

    public static double getMean(ArrayList<Integer> arr){
        return arr.stream().mapToInt(x->x).average().orElse(0.0);
    }

    public static int getMax(ArrayList<Integer> arr){
        return  arr.stream().max(Integer::compare).get();
    }
    public static int getMin(ArrayList<Integer> arr){
        return  arr.stream().min(Integer::compare).get();
    }


    public static void main(String[] args) {
        Integer[] arr = new Integer[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        ArrayList<Integer> listInteger = new ArrayList<Integer>();
        Collections.addAll(listInteger, arr);
        System.out.println(getMax(listInteger));
        System.out.println(getMin(listInteger));
        System.out.println(getMean(listInteger));
    }
}
