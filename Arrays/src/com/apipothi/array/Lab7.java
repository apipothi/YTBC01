package com.apipothi.array;

public class Lab7 {

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

        int sizeofArray=studentName.length;// 5

        System.out.println("Fist Element of the Array :: "+ studentName[0]);
        System.out.println("Last Element of the Array :: "+ studentName[4]);
        System.out.println("Last Element of the Array :: "+ studentName[5-1]);
        System.out.println("Last Element of the Array :: "+ studentName[sizeofArray-1]);


        System.out.println("***** END - Lab6 ***** ");
    }
}
