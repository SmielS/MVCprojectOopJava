package ru.gb.oseminar.data;

public abstract class User {
    private String firstName;
    private String secondName;
    private String patronymic;
    private Long studyGroupId;

    public User(String firstName, String secondName, String patronymic) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.studyGroupId = -1L;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Long getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(Long studyGroupId) {
        this.studyGroupId = studyGroupId;
    }

    @Override
    public String toString() {
        if (this.studyGroupId.equals(-1L)) {
            return "User{" +
                    "firstName='" + this.firstName + '\'' +
                    ", lastName='" + this.secondName + '\'' +
                    ", patronymic='" + this.patronymic + '\'' +
                    "}";
        } else {
            return "User{" +
                    "firstName='" + this.firstName +
                    "', lastName='" + this.secondName +
                    "', patronymic='" + this.patronymic +
                    "', studyGroup=" + this.studyGroupId +
                    "}";
        }
    }
}
