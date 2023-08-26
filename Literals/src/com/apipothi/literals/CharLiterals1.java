package com.apipothi.literals;

public class CharLiterals1 {

    public static void main(String[] args) {

        System.out.println("*********** START - Literals Example CharLiterals1 ::  ");

        char x = 'A';
        System.out.println(" x:: "+ x);

        char x1 = '1';
        System.out.println(" x:: "+ x1); // x:: 1

        //char x2 = '11';
        //System.out.println(" x:: "+ x2); // x:: 1

        char x3 = 65  ;
        System.out.println(" x:: "+ x3); // x:: A

        char x4 = 90  ;
        System.out.println(" x:: "+ x4); // x:: Z

        char x5 = '\u0041'; // U+0041
        System.out.println(" x:: "+ x5); // x:: A

        //char x6 = '\U0041'; // U+0041
        //System.out.println(" x:: "+ x6); // x:: A // illegal escape character

        System.out.println("-------");
        char x7 = '\n';
        System.out.println(" x7:: "+ x7);
        System.out.println("-------");

        System.out.println("-------");
        char x8 = '\t';
        System.out.println(" x8:: "+ x8);
        System.out.println("-------");

        System.out.println("*********** END - Literals Example CharLiterals1 ::  ");
    }
}
