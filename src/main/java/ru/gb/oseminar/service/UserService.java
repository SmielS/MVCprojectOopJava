package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (User user : this.users) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        return students;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        for (User user : this.users) {
            if (user instanceof Teacher) {
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }

    @Override
    public void createStudent(String firstName, String lastName, String patronymic) {
        Long studentID = 0L;
        for (User user : this.users) {
            if (user instanceof Student) {
                if (studentID < ((Student) user).getStudentID()) {
                    studentID = ((Student) user).getStudentID();
                }
            }
        }
        this.users.add(new Student(firstName, lastName, patronymic, ++studentID));
    }

    @Override
    public void createTeacher(String firstName, String lastName, String patronymic) {
        Long teacherID = 0L;
        for (User user : this.users) {
            if (user instanceof Teacher) {
                if (teacherID < ((Teacher) user).getTeacherID()) {
                    teacherID = ((Teacher) user).getTeacherID();
                }
            }
        }
        this.users.add(new Teacher(firstName, lastName, patronymic, ++teacherID));
    }

    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteStudent(Long id) {
        for (User user : this.users) {
            if (user instanceof Student) {
                if (id.equals(((Student) user).getStudentID())) {
                    this.users.remove(user);
                }
            }
        }
    }

    @Override
    public void deleteTeacher(Long id) {
        for (User user : this.users) {
            if (user instanceof Teacher) {
                if (id.equals(((Teacher) user).getTeacherID())) {
                    this.users.remove(user);
                }
            }
        }
    }

    @Override
    public void deleteAllUsers() {
        this.users = new ArrayList<>();
    }

}
