package com.schoolexample_class;

public class student {
    static String name;
    static int dateOfBirth;
    static int average;
    static boolean admitted;

    student(){}


    student(String name, int dateOfBirth, byte average, boolean admitted) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.admitted = admitted;
    }

}
