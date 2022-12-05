package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {
    public void sendOnConsole(List<User> users) {
        Logger log = Logger.getLogger(UserView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }

    public void showStudents(List<Student> students) {
        Logger log = Logger.getLogger(UserView.class.getName());
        for (Student student : students) {
            log.info(student.toString());
        }
    }

    public void showStudentsWithGroup(List<Student> students) {
        Logger log = Logger.getLogger(UserView.class.getName());
        log.info("\n");
        for (Student student : students) {
            log.info(student.getSecondName() + " " + student.getFirstName() + " - Группа " + student.getStudyGroupId());
        }
    }
}
