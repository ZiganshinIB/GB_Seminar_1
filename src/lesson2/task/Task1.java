package lesson2.task;

public class Task1 {

    public static String getRepeatString(int numN){
        StringBuilder sb = new StringBuilder();
        sb.append("c1");
        for(int i = 0; i < numN; i++){
            if (i % 2 == 0) sb.append("c2");
            else sb.append("c1");
        }
        System.out.println();
        return sb.toString();
    }
}
