package lesson5.homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff("Иван", "Иванов"));
        staffList.add(new Staff("Светлана", "Петрова"));
        staffList.add(new Staff("Кристина", "Белова"));
        staffList.add(new Staff("Анна", "Мусина"));
        staffList.add(new Staff("Анна", "Крутова"));
        StaffMap staffMap = new StaffMap(staffList);
        staffMap.print();
        int[] ints = new int[]{12,412,4,12,55,12,5,32,123,56,112,53,12};
        HeapSort.heapsort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(romanToArabic("MMXXIV"));

    }

    public static int romanToArabic(String romanNumber) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int arabicNumber = 0;
        int prevValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(romanNumber.charAt(i));
            if (currentValue < prevValue) {
                arabicNumber -= currentValue;
            } else {
                arabicNumber += currentValue;
            }
            prevValue = currentValue;
        }
        return arabicNumber;
    }
}
