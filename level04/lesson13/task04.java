package com.javarush.test.level04.lesson13.task04;

//All things that are mine are yours, and yours are mine, and I am glorified in them. (John 17:10)

import java.io.*;

/* Draw lines
Write a program that displays
    -	a horizontal line of 10 eights
    -	a vertical line of 10 eights
    Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 0; i < 9; i++) {//add your code here
            System.out.print(8);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(8);
        }
    }
}
