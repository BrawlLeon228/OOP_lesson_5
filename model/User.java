package lesson5.OOP_lesson_5.model;

public abstract class User {
    private String name;
    private String surname;

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "name=" + name + " surname=" + surname;
    }
}
