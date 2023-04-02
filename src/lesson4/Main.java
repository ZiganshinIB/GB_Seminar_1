package lesson4;


import lesson4.sample.StreamApi;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StreamApi api = new StreamApi();

        List<Integer> arr = List.of(1,2,5,10);

        int i = arr.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        double d = arr.stream().mapToInt(Integer::intValue).average().orElse(Integer.MIN_VALUE);

        System.out.println(i);
        System.out.println(d);
    }
}
