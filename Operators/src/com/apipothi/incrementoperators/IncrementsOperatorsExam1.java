package com.apipothi.incrementoperators;

public class IncrementsOperatorsExam1 {

    public static void main(String[] args) {

        System.out.println("******* START-IncrementsOperatorsExam1 *******");

        int a = 2;
        System.out.println("---- Value of A :: "+a);//2

        int a1 = 2+1;
        System.out.println("---- Value of A1 :: "+a1);//3

        int a2 = 2; // Pre Increment
        ++a2;
        System.out.println("---- Value of A1 :: "+a2);//-> 3

        System.out.println("******* END-IncrementsOperatorsExam1 *******");
    }
}
