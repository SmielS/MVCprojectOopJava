package ru.gb.oseminar.data;

public class Teacher extends User {

    private Long teacherID;

    public Teacher(String firstName, String secondName, String patronymic, Long teacherID) {
        super(firstName, secondName, patronymic);
        this.teacherID = teacherID;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }
}