package ru.gb.oseminar.data;

public class Student extends User {

    private Long studentID;

    public Student(String firstName, String secondName, String patronymic, Long studentID) {
        super(firstName, secondName, patronymic);
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
}
