package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.List;

public interface StudyGroupDataService {
    void createStudyGroup(Teacher teacher, List<Student> students);

    List<StudyGroup> getStudyGroups();
}
