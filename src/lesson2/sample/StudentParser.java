package lesson2.sample;

public class StudentParser {
    private  static  String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

    public  static  void parse(){
        StringBuilder builder = new StringBuilder("s");
        String[] name = json.split(",");
        for (String s : name){
            if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("фамилия")){
                builder.append("Студент ")
                        .append(s.replaceAll("[\"}\\[\\]]", "")
                                .split(":")[1]);
            }

            if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("оценка")){
                builder.append(" получил(-а) ")
                        .append(s.split(":")[1]
                                .replaceAll("[\"}\\[\\]]", ""));
            }

            if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("предмет")){
                builder.append(" по предмету ")
                        .append(s.split(":")[1]
                                .replaceAll("[\"}\\[\\]]", "")).append(".\n");
            }
        }
    }
}
