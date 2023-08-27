package com.apipothi.incrementoperators;
public class IncrementsOperatorsExam10 {
    public static void main(String[] args) {
        // Difference between b++ and b+1
        System.out.println("******* START-IncrementsOperatorsExam9 *******");

        int a = 10;
        a++;
        System.out.println(a);//11

        int a1 = 10;
        int a2= a1+1; // int + int
        System.out.println(a1);//10
        System.out.println(a2);//11

        System.out.println("******* END-IncrementsOperatorsExam9 *******");
    }
}
