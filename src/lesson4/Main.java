package lesson4;


import lesson4.sample.MyStack;
import lesson4.sample.StreamApi;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyStack<Integer> newStack = new MyStack<>();
        newStack.push(2);

        System.out.println(newStack.pop());
    }
}
