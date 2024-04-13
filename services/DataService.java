package lesson5.OOP_lesson_5.services;

import lesson5.OOP_lesson_5.model.User;
import lesson5.OOP_lesson_5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

import lesson5.OOP_lesson_5.model.Student;
import lesson5.OOP_lesson_5.model.Type;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }
    public void create(String name, String surname, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(name, surname, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(name, surname, id);
            userList.add(teacher);
        }
    }
    private int getFreeId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user: userList) {
            if (user instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public List<User> getAllStudents(){
        List<User> rUsers = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student){
                rUsers.add(user);
            }
        }
        return rUsers;
    }
}
