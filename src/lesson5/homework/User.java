package lesson5.homework;

public class User {

    private String name;
    private String lName; // Фамилия
    private String tName=null; // Отчество

    private String passport=null;

    public User(String name, String lName){
        this.name = name;
        this.lName = lName;
    }

    public User(String name, String lName, String tName){
        this(name, lName);
        this.tName = tName;
    }

    public User(String name, String lName, String tName, String passport){
        this(name, lName, tName);
        this.passport = passport;
    }

    public void setPassport(String passport) {
        if (passport == null) this.passport = passport;
        else throw new RuntimeException("У человека есть паспорт!!!");
    }

    @Override
    public int hashCode() {
        return this.passport.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  User){
            return ((User) obj).passport.equals(this.passport) &&
                    ((User) obj).name.equals(this.name) &&
                    ((User) obj).lName.equals(this.lName) &&
                    ((User) obj).tName.equals(this.tName);

        }else return false;
    }

    @Override
    public String toString() {
        if(this.tName != null)
            return lName + " " + this.name + " " + this.tName;
        else return  lName + " " + this.name;
    }
}
