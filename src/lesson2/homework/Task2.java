package lesson2.homework;

import java.util.Arrays;

// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
public class Task2 {

    public static String[][] getDate(String text){
        String[] listText = text.split("},");
        String[][] listStr = new String[listText.length][3];

        for (int i = 0; i < listText.length; i++){
            listText[i] = listText[i].replace('\"', ' ').substring(3);
            if (i ==listText.length-1) listText[i] = listText[i].substring(0, listText[0].length() -3);
            String[] arrayLine = listText[i].split(" , ");
            for(int j = 0; j < arrayLine.length; j++ ) listStr[i][j] = arrayLine[j].split(" : ")[1];
        }

        return listStr;
    }

    public static void write(String pater, String[] math, String[][] date) {
        for (int i = 0; i < date.length; i++ ){
            String[] line = date[i];
            String printLine = pater;
            for (int j = 0; j < line.length; j++){
                printLine = printLine.replaceAll(math[j], line[j]);
            }
            System.out.println(printLine);
        }
    }
}
