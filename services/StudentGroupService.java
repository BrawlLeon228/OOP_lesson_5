package lesson5.OOP_lesson_5.services;

import lesson5.OOP_lesson_5.model.Student;
import lesson5.OOP_lesson_5.model.StudentGroup;
import lesson5.OOP_lesson_5.model.Teacher;

import java.util.List;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList) {
        return new StudentGroup(teacher, studentList);
    }

}
