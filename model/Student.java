package lesson5.OOP_lesson_5.model;

public class Student extends User{
    private int studentId;

    public Student(String name, String surname, int studentId) {
        super(name, surname);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + super.toString() + "}";
    }

    public int getStudentId() {
        return studentId;
    }
}
