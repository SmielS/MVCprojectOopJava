package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.*;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentView;
import ru.gb.oseminar.view.StudyGroupView;
import ru.gb.oseminar.view.UserView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final UserView userView = new UserView();
    private final StudentView studentView = new StudentView();
    private final StudyGroupView studyGroupView = new StudyGroupView();


    public void createStudent(String firstName, String secondName, String patronymic) {
        userService.createStudent(firstName, secondName, patronymic);
    }

    public void createTeacher(String firstName, String secondName, String patronymic){
        userService.createTeacher(firstName, secondName, patronymic);
    }

    public List<Student> getAllStudents(){ return userService.getAllStudents();}
    public List<Teacher> getAllTeachers(){ return userService.getAllTeachers();}
    public void deleteAllUsers() {
        this.userService.deleteAllUsers();
    }

    public void createStudyGroup() {
        Long studyGroupID = this.studyGroupService.getStudyGroupMaxID();
        studyGroupID ++;
        List<Teacher> teachers = this.userService.getAllTeachers();
        Teacher teacherForGroup = null;

        for (Teacher teacher : teachers) {
            if (teacher.getStudyGroupId().equals(-1L)) {
                teacher.setStudyGroupId(studyGroupID);
                teacherForGroup = teacher;
            }
        }
        if (teacherForGroup == null) {
            throw new IllegalStateException("Teacher not found for creating a StudyGroup");
        }

        List<Student> students = this.userService.getAllStudents();
        List<Student> studentsForGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudyGroupId().equals(-1L))  {
                student.setStudyGroupId(studyGroupID);
                studentsForGroup.add(student);
            }
        }
        if (studentsForGroup.isEmpty()) {
            throw new IllegalStateException("Students not found for creating a StudyGroup");
        }

        this.studyGroupService.createStudyGroup(teacherForGroup, studentsForGroup);
        this.studyGroupView.sendOnConsole(this.studyGroupService.getStudyGroups());
    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public List<StudyGroup> getAllStudyGroups() {
        return this.studyGroupService.getStudyGroups();
    }

    public void showSortStudyGroup (List<Student> students) {
        students.sort(new UsersComparator());
        this.userView.showStudents(students);
    }

    public void showSortedStudents (List<StudyGroup> studyGroups) {
        List<Student> students = new ArrayList<>();
        for (StudyGroup studyGroup : studyGroups) {
            students.addAll(studyGroup.getStudents());
        }
        students.sort(new UsersComparator());
        this.userView.showStudentsWithGroup(students);
    }
}
