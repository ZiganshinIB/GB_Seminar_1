package lesson5.homework;

import java.util.SplittableRandom;

public class Staff {
    private String name;
    private String lName;

    public Staff(String name, String lName){
        this.name=name;
        this.lName=lName;
    }

    public String getName() {
        return name;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Staff)
            return  ((Staff) obj).name.equals(this.name) &&
                    ((Staff) obj).lName.equals(this.lName);
        else return false;
    }

    @Override
    public String toString() {
        return this.lName + " " + this.name;
    }
}
