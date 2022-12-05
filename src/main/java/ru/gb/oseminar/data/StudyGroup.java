package ru.gb.oseminar.data;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
    private Long studyGroupID;

    public StudyGroup(Teacher teacher, List<Student> students, Long studyGroupID){
        this.students = students;
        this.teacher = teacher;
        this.studyGroupID = studyGroupID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Long getStudyGroupID() {
        return studyGroupID;
    }
    public void setStudyGroupID(Long studyGroupID) {
        this.studyGroupID = studyGroupID;
    }

}
