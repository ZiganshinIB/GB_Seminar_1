package lesson3.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Task3 {
    public static void removeIntValuesInStrList(List object){
        ArrayList list = new ArrayList<String>();
        list.add(1);
        list.add("wrwa");
        System.out.println(list);
        for (Object o: list){
            if(o instanceof Integer){
                list.remove(0);
            }
        }
        System.out.println(list);
    }
}
