package lesson2;


import lesson2.homework.Task1;
import lesson2.homework.Task2;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 22,13,53,12,56};
        System.out.println(Arrays.toString(Task1.bubbleSort(arr)));
        String text = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] math = new String[]{"фамилия", "оценка", "предмету"};
        String pater = "Студент фамилия получил оценка по предмету";
        String[][] date =  Task2.getDate(text);
        Task2.write(pater, math, date);
    }
}
