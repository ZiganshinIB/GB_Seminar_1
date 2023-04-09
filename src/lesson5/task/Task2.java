package lesson5.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task2 {
    public static Map<Character, Character> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(isValid("( dafd)"));
        System.out.println(isValid("( (dafd)"));
        System.out.println(isValid("( <dafd)"));
        System.out.println(isValid("dafd"));
        System.out.println(isValid("( dafd>"));
        System.out.println(isValid("<()[[] d]afd>"));
    }

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        String open = "<({[/";
        String close = ">)}]\\";
        initMap(open, close);

        for (int i = 0; i < str.length(); i++){
            var c = str.charAt(i);
            if (containsStr(open,c)) stack.push(c);
            else if(isClosed(c)) if (stack.pop() != map.get(c)) return false;
        }
        if(stack.isEmpty()) return true;
        else return false;

    }

    private static boolean containsStr(String s, char charAt) {
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == charAt) return true;
        return false;
    }


    public static void initMap(String open, String close){
        for (int i = 0; i < open.length(); i++)
            map.put(close.charAt(i), open.charAt(i));
    }

    private static boolean isClosed(Character c) {
        return map.containsKey(c);
    }


}
