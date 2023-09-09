package com.apipothi.forloop;

public class Lab3 {
    public static void main(String[] args) {

        System.out.println("START-***************Lab2***************");

        String[] myStringArray={"A","B","C","D"};// Assume Lenght of the Array is 1000

        int arrayLength=myStringArray.length;//4
        System.out.println("Length of Array ::"+arrayLength);


        for(int i = 0;i<arrayLength;i++){

            System.out.println("myStringArray[0] :: "+myStringArray[i]);
        }


        System.out.println("END-***************Lab2***************");
    }
}
