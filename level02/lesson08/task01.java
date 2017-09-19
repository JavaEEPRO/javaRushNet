package com.javarush.test.level02.lesson08.task01;

//O the depth of the riches of the wisdom and of the knowledge of God! How incomprehensible are his judgments, and how unsearchable his ways!

import java.lang.System;

/* Minimum of two numbers
Write a function that returns a minimum of two numbers.
*/
public class Solution
{
    public static int min(int a, int b)
    {
       if (a<b){return a;} //add your code here
       else {return b;}
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(12,33) );
        System.out.println( min(-20,0) );
        System.out.println( min(-10,-20) );
    }

}
