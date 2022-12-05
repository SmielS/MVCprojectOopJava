package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.createTeacher("Eddard ","Stark", "Lord of Winterfell");
        controller.createStudent("Jon", "Snow", "Bastard");
        controller.createStudent("Theon","Greyjoy","Prince of Fools");
        controller.createStudyGroup();

        controller.createTeacher("Catelyn","Stark","Lady Cat");
        controller.createStudent("Sansa","Stark","Little Bird");
        controller.createStudent("Arya","Stark","Arya Horseface");
        controller.createStudyGroup();

        controller.createTeacher("Tywin","Lannister","The Lion of Lannister");
        controller.createStudent("Tyrion", "Lannister", "Halfman");
        controller.createStudent("Jamie", "Lannister", "Halfman");
        controller.createStudyGroup();

        controller.showSortedStudents(controller.getAllStudyGroups());
    }
}