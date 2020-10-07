package com.school_input;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.print("Enter second number- ");
        int b= sc.nextInt();
        System.out.print("Enter third number- ");
        int c= sc.nextInt();
        int d=a+b+c;
        System.out.println("Total= " +d);
    }
}

// javatpoint.com/how-to-get-input-from-user-in-java