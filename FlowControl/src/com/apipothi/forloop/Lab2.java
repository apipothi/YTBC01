package com.apipothi.forloop;

public class Lab2 {
    public static void main(String[] args) {

        System.out.println("START-***************Lab2***************");

        int[] myIntArray={100,200,32,45,65,243,89,64};// Assume Lenght of the Array is 1000

        int arrayLength=myIntArray.length;//8

        for(int i = 0;i<arrayLength;i++){

            System.out.println("myIntArray[0] :: "+myIntArray[i]);
        }

        /*
        * ITERATION - 0
        *   i = 0 ; 0<8=True
        *   myIntArray[0]=100
        *   i = 1

      *   ITERATION - 1
      *     i = 1
      *     1<8 = True
      *     myIntArray[1]=200
      *     i = 2
      *
      *   ITERATION - 2
      *     i = 2
      *     2 < 8 = True
      *     myIntArray[2]=32
      *     i = 3
      *
      *    ITERATION - 3
      *     i = 3
      *     3 < 8 = True
      *     myIntArray[3]=45
      *     i = 4
      *
      *     ITERATION - 4
         *     i = 4
         *     4 < 8 = True
         *     myIntArray[4]=65
         *     i = 5
         *
         *  ITERATION - 5
         *     i = 5
         *     5 < 8 = True
         *     myIntArray[5]=243
         *     i = 6
         *
         * ITERATION - 6
         *     i = 6
         *     6 < 8 = True
         *     myIntArray[6]=89
         *     i = 7
         *
         *  ITERATION - 7
         *     i = 7
         *     7 < 8 = True
         *     myIntArray[7]=64
         *     i = 8
         *
         * *  ITERATION - 8
         *     i = 8
         *     8 < 8 = False
         *
         *
      *
        * */


        System.out.println("END-***************Lab2***************");
    }
}
