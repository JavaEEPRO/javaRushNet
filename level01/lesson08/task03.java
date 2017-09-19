package com.javarush.test.level01.lesson08.task03;

/* Plant now
Write a program that displays 16 times: «What you plant now, you will harvest later.».
*/
public class Solution
{
    public static void main(String[] args)
    {
       for (int i = 0; i < 4; i++){ //add your code here
       print4Times("What you plant now, you will harvest later.");
       }
    }

    public static void print4Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
