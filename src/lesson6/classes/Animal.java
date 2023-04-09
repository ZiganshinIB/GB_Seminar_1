package lesson6.classes;

import java.awt.*;
import java.util.List;

public class Animal{
    protected int legsCount;
    public String type;
    public String color;

    public Animal() {
        this(13, "Dog", "Зеленый");
    }

    public Animal(int legsCount, String type, String color) {
        this.legsCount = legsCount;
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Животное " + type + " цвет " + color;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal)
            if (((Animal) obj).color.equals(this.color) &&
                    ((Animal) obj).type.equals(this.type) &&
                    ((Animal) obj).legsCount == this.legsCount)
                return true;
            else return false;
        else return  false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

