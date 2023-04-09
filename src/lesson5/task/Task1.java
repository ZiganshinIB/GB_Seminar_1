package lesson5.task;

import java.util.*;

public class Task1 {
    public static void main(String[] args){
        System.out.println(isIsomorph("abba", "baab"));
    }

    public static boolean isIsomorph(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> usedValues = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (usedValues.containsKey(c2)) {
                    return false;
                }
                map.put(c1, c2);
                usedValues.put(c2, c1);
            }
        }

        return true;

    }

}
