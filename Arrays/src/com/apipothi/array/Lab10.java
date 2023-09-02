package com.apipothi.array;

public class Lab10 {

    public static void main(String[] args) {

        System.out.println("***** STRAT - Lab10 ***** ");

        String[] studentName=new String[5]; // I am trying to create the array of String , Size 5

        // Inserting the data
        studentName[0]="A";
        studentName[1]="B";
        studentName[2]="C";
        studentName[3]="D";
        studentName[4]="E";

        System.out.println("----- BEFORE UPDATE -----");
        System.out.println(studentName[0]);
        System.out.println(studentName[1]);
        System.out.println(studentName[2]);
        System.out.println(studentName[3]);
        System.out.println(studentName[4]);

        // Update the data in to Array
        studentName[0]="Aditya-1";
        studentName[2]="CAT";

        System.out.println("----- AFTER UPDATE -----");
        // Extract/Display the data
        System.out.println(studentName[0]);
        System.out.println(studentName[1]);
        System.out.println(studentName[2]);
        System.out.println(studentName[3]);
        System.out.println(studentName[4]);


        System.out.println("***** END - Lab10 ***** ");
    }
}
