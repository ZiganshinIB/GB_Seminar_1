package lesson2.homework;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class BubbleSorted {

    public static void bubbleSort(int[] arr){
        Logger logger = createLogger();
        logger.info("Origin: " + Arrays.toString(arr));
        int length = arr.length;
        for (int i=1; i < length; i++){
            boolean isSorted = true;
            for (int j = 0; j < length - i; j++) {
                if (arr[j]> arr[j+1]){
                    isSorted = false;
                    int temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    logger.info(i+ "."+j+": "+ Arrays.toString(arr));
                }
            }
            if (isSorted) break;
        }
        System.out.println("");
    }

    private static Logger createLogger(){
        Logger logger = Logger.getLogger(BubbleSorted.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
        }catch (IOException e){
            e.printStackTrace();
        }
        return logger;
    }
}
