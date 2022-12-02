package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("Name1", "2ndName1", "3rdName1");
    }
}