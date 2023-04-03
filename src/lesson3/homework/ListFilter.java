package lesson3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ListFilter {
    public static List<Integer> notZero(List<Integer> arr){
        return arr.stream().filter(x -> x!=0).toList();
    }

    public static List<Integer> getOddList(List<Integer> arr){
        return arr.stream().filter(x -> (x%2)!=0).toList();
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        ArrayList<Integer> listInteger = new ArrayList<Integer>();
        Collections.addAll(listInteger, arr);
        System.out.println(listInteger);
        System.out.println(getOddList(listInteger));
    }
}
