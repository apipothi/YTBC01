package com.apipothi.explicittypecasting;

public class Lab1 {
    public static void main(String[] args) {

        System.out.println("*** STRAT -- Lab1 ******* ");

        //byte b1 = 130;
                        //Required type: byte
                        //Provided: int

        byte b1 = (byte) 130; // 130 - int , I am converting int type in to byte Type

        System.out.println("Value of B1  "+ b1); // Value of B1  -126

        System.out.println("*** END -- Lab1 ******* ");
    }
}
