package lesson6.task;

public class Main {
    public static void main(String[] args) {
        complete("2 + 2", "Linux");
    }

    private static void complete(String code, String os_name){
        OS os =null;
        switch (os_name){
            case "Windows":
                os = new Windows();
                os.compleat(code);
                break;
            case "Linux":
                os = new Linux();
                os.compleat(code);
                break;
            default:
                System.out.println("System error: This OS do not have my Completer");
        }
    }
}
