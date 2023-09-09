package com.apipothi.forloop;

public class Lab4 {
    public static void main(String[] args) {

        System.out.println("START-***************Lab4***************");

        char[] myCharArray={'A','B','C','D'};

        int arrayLength=myCharArray.length;//4
        System.out.println("Length of Array ::"+arrayLength);


        for(int i = 0;i<arrayLength;i++){

            System.out.println("myCharArray[0] :: "+myCharArray[i]);
        }


        System.out.println("END-***************Lab4***************");
    }
}
