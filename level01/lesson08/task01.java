package com.javarush.test.level01.lesson08.task01;

import java.lang.String;

/* Life is not fair
Write a program that displays 9 times: «Life is not fair - get used to it.».
*/
public class Solution
{
    public static void main(String[] args)
    {
       for (int i = 0; i < 3; i++){ //add your code here
       print3Times("Life is not fair - get used to it.");
       }
    }

    public static void print3Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
