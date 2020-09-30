package com.schoolexample_class;

public class Main {

    public static void main(String[] args) {
        student PietroSmusi = new student("Pietro Smusi", 1109_2001, (byte) 18, false);

        System.out.println("Name: " + student.name + "\nDate of birth: " + student.dateOfBirth + "\nAverage: " +
                student.average + "\nAdmitted: " + student.admitted);
    }
}
