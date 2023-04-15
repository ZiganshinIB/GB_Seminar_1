package lesson5.homework;

import java.util.ArrayList;
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


    }
}
