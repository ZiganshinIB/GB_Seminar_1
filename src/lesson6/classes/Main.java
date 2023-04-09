package lesson6.classes;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Иваныч","89456523252");
        Cat cat = new Cat("Matros", "standart", 9, owner);
        cat.sleep(true);
        Cat cat1 = new Cat("Matros", "standart", 9, owner);
        System.out.println(cat);
        System.out.println((cat.equals(cat1)));


    }
}
