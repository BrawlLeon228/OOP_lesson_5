package lesson5.OOP_lesson_5.controller;

import lesson5.OOP_lesson_5.model.*;
import lesson5.OOP_lesson_5.services.DataService;
import lesson5.OOP_lesson_5.services.StudentGroupService;
import lesson5.OOP_lesson_5.view.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String name, String surname) {
        service.create(name, surname, Type.STUDENT);
    }
    public void getAllStudents(){
        List<User> rUsers = service.getAllStudents();
        for (User user : rUsers) {
            studentView.printOnConsole((Student) user);
        }
    }
    public void createStudentGroup(Teacher teacher, List<Student> studentList) {
        StudentGroupService studentGroupService = new StudentGroupService();
        studentGroupService.createStudentGroup(teacher, studentList);
        System.out.println("Teacher's id: " + teacher.getTeacherId());
        for (Student student: studentList) {
            System.out.println("Student's id: " + student.getStudentId());
        }
    }
}
