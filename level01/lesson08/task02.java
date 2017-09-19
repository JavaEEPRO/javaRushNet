package com.javarush.test.level01.lesson08.task02;

/* Stakeholder in your life
Write a program that displays 4 times: «The most important stakeholder in your life is You.».
*/
public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 2; i++){//add your code here
        print2Times("The most important stakeholder in your life is You.");
        }
    }

    public static void print2Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
    }
}
