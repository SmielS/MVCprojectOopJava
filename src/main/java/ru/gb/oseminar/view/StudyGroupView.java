package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudyGroupView {
    public void sendOnConsole(StudyGroup studyGroup) {
        Logger log = Logger.getLogger(StudyGroupView.class.getName());

        Long studyGroupID = studyGroup.getStudyGroupID();
        List<Student> students = studyGroup.getStudents();
        log.info("StudyGroup № " + studyGroupID + " [" + studyGroup.getTeacher().toString() + "]");

        for (Student student : students) {
            log.info("StudyGroup № " + studyGroupID + " [" + student.toString() + "]");
        }
    }

    public void sendOnConsole(List<StudyGroup> studyGroups) {
        Logger log = Logger.getLogger(StudyGroup.class.getName());
        for (StudyGroup studyGroup : studyGroups) {
            log.info("\n");
            sendOnConsole(studyGroup);
        }
    }
}
