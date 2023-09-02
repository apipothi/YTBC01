package com.apipothi.array;

public class Lab6 {

    public static void main(String[] args) {

        System.out.println("***** STRAT - Lab6 ***** ");

        String[] studentName=new String[5]; // I am trying to create the array of String , Size 5

        // Inserting the data
        studentName[0]="A";
        studentName[1]="B";
        studentName[2]="C";
        studentName[3]="D";
        studentName[4]="E";
        // Size of the Array = 5
        // Length of the Array = 5

        int sizeofArray=studentName.length;

        System.out.println("Length of the Array :: "+ sizeofArray);




        System.out.println("***** END - Lab6 ***** ");
    }
}
