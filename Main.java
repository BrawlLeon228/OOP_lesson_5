package lesson5.OOP_lesson_5;

import lesson5.OOP_lesson_5.controller.Controller;
import lesson5.OOP_lesson_5.model.Student;
import lesson5.OOP_lesson_5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Student student1 = new Student("1", "1", 1);
        Student student2 = new Student("2", "2", 2);
        Student student3 = new Student("3", "3", 3);
        Student student4 = new Student("4", "4", 4);

        Teacher teacher = new Teacher("10", "10", 1);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        controller.createStudentGroup(teacher, studentList);
    }
}
