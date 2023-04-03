package lesson3.homework;

import java.util.Arrays;
import java.util.List;

public class MergeSorting {
    public static int[] sort (int[] arr){
        int N = arr.length;
        if (N==1) {
            return arr;
        }
        int median = (N/2)-1+(N%2);
        int[] arrLeft = sort(Arrays.copyOfRange(arr, 0,median+1));
        int[] arrRight = sort(Arrays.copyOfRange(arr, median+1, N));
        return mergeArray(arrLeft, arrRight);

    }


    private static int[] mergeArray(int[] a, int[] b){// принимает сортированый элементы a и b (сотрированые тажкже считаем одинокие элементы)
        int countA = 0; // можно было и offsetA или indexA
        int countB = 0;
        int[] res = new int[a.length+b.length];
        for (int i = 0; i < res.length; i++) {
            if(countA == a.length){ // Если мы все элементы перебрали в левой стороне
                res[i] = b[countB];
                countB++;
            } else if (countB == b.length) { // Если мы перебрали все элементы в праваой стороне
                res[i] = a[countA]; // всталяем что есть с лева
                countA++;
            }else if (a[countA] >= b[countB]){ //
                res[i] = b[countB];
                countB++;
            } else if (a[countA] < b[countB]) {
                res[i] = a[countA];
                countA++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ar = new int[]{1,4,25,1,5,6,1};
        System.out.println(Arrays.toString(sort(ar)));
    }

//    private static void mergeArray(int[] a, int start, int end, int median){// принимает сортированый элементы a и b
//        int currentIndex = start;
//        int targetIndex = median+1;
//        int current = a[currentIndex];
//        int target = a[targetIndex];
//        for (int i = start; i <= end ; i++) {
//            if (targetIndex == end+1){ // вышли за границы
//                a[i] = current;
//                currentIndex++;
//            } else if (current == target) {
//                a[i] = current;
//                currentIndex++;
//                current = a[currentIndex];
//                i++;
//                a[i] = target;
//                targetIndex++;
//                target = a[targetIndex];
//                currentIndex++;
//            } else if (current > target) { // Елси левая часть выйдить то сработает `=` и target-ми запольнится
//                targetIndex++;
//                int newTarget = a[targetIndex];
//                a[i] = target;
//                target = newTarget;
//
//            } else if (current < target){
//                currentIndex++;
//                int newCurrent =  a[currentIndex];
//                a[i] = current;
//                current = newCurrent;
//            }
//        }
//    }
//    public static void sort(int[] array, int start, int end){
//        int N = end - start + 1;
//        if (N == 2){
//            if (array[start] > array[end]){
//                var temp = array[start];
//                array[start] = array[end];
//                array[end] = temp;
//            }
//        } else if (N==1) {
//        } else {
//            int median = start +((N/2)-1+(N%2));
//            sort(array, start, median);
//            sort(array, median+1, end);
//            mergeArray(array, start, end, median);
//        }
//
//    }


}
