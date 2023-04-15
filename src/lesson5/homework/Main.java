package lesson5.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    }
}
