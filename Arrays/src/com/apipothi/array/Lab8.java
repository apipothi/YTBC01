package com.apipothi.array;

public class Lab8 {

    public static void main(String[] args) {

        System.out.println("***** STRAT - Lab8 ***** ");

        String[] studentName=new String[5]; // I am trying to create the array of String , Size 5

        // Inserting the data
        studentName[0]="A";
        studentName[1]="B";
        studentName[2]="C";
        studentName[3]="D";
        studentName[4]="E";
        studentName[5]="F"; // ArrayIndexOutOfBoundsException: 5


        // Extract/Display the data
        System.out.println(studentName[0]);
        System.out.println(studentName[1]);
        System.out.println(studentName[2]);
        System.out.println(studentName[3]);
        System.out.println(studentName[4]);
        //System.out.println(studentName[5]);
        

        System.out.println("***** END - Lab8 ***** ");
    }
}
