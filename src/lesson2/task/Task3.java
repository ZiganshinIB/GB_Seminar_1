package lesson2.task;

import java.io.FileWriter;
import java.io.IOException;

public class Task3 {

    public static void write(String argument){
        try (FileWriter inFile = new FileWriter("test.txt")){
            inFile.append(String.valueOf(argument).repeat(5));
            System.out.println("Recorded ...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
