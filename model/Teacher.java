package lesson5.OOP_lesson_5.model;

public class Teacher extends User{
    private int teacherId;

    public Teacher(String name, String surname, int teacherId) {
        super(name, surname);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacheId) {
        this.teacherId = teacherId;
    }
    @Override
    public String toString() {
        return "Teacher{" + "teacherId=" + teacherId + super.toString() + "}";
    };
}
