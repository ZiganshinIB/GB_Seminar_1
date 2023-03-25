package lesson1.task1;

import java.math.BigInteger;

public class TaskLess_1 {
    public static int arithmeticProgression(int n, int start, int step){
        return ((2 * start -  step*(n-1))*n)/2;
    }

    public static int arithmeticProgression(int n, int start){
        return ((2 * start - (n-1))*n)/2;
    }

    public static int arithmeticProgression(int n){
        return ((2 - (n-1))*n)/2;
    }

    public static int factorial(int n){
        if(n == 0) return 1;
        else return factorial(n-1) * n;
    }

    public static void printPrimeNumbers(int number){
        for(int i=2; i<number; i++) if (isPrimeNumber(i)) System.out.println(i);
    }

    private static boolean isPrimeNumber(int number){
        for(int i=2; i < number; i++) if ((number%i)==0) return false;
        return true;
    }
}
