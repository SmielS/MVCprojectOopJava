package ru.gb.oseminar.data;

import java.util.Comparator;

public class UsersComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getSecondName().equalsIgnoreCase(o2.getSecondName())){
            return o1.getFirstName().compareTo(o2.getFirstName());
        }

        return o1.getSecondName().compareTo(o2.getSecondName());
    }
}
