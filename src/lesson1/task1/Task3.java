package lesson1.task1;

public class Task3 {
    public static int getMaxOneCount(int[] arg){
        int maxCount = 0;
        int count = 0;
        for (int i : arg){
            if( i == 1)
                count++;
            else{
                if (maxCount < count) maxCount = count;
                count = 0;
            }
        }
        if (maxCount < count) maxCount = count;

        return maxCount;
    }
}
