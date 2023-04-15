package lesson5.homework;

import lesson6.classes.Animal;

public class Phone {
    private String operator_name = null;
    private String number = null;
    public Phone(String number){
        this.number = number;
    }

    public Phone(String number, String operator_name){
        this(number);
        this.operator_name = operator_name;
    }

    public void setOperator_name(String operator_name) throws Exception {
        if(this.operator_name == null){
            this.operator_name = operator_name;
        }else {
            throw new Exception("Оператор уже имеется!!!");
        }
    }

    public String getNumber() {
        return this.number;
    }

    public String getOperator_name() {
        return this.operator_name;
    }

    @Override
    public int hashCode() {
        return this.number.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Phone)
            return ((Phone) obj).number.equals(this.number) &&
                    ((Phone) obj).operator_name.equals(this.operator_name);
        else return  false;
    }

    @Override
    public String toString() {
        return this.number;
    }
}
