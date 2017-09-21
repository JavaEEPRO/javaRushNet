package com.javarush.test.level04.lesson13.task03;

//You are my friends, if you do whatever I command you (John 15:14)

import java.io.*;

/* Draw a triangle
Write a program that displays a right triangle composed of eights with sides 10 and 10. Use “for” loop.

    Example:
    8
    88
    888
    ...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       for(int i = 1; i < 11; i++){ //add your code here
            for (int j = 0; j < i; j++) {
            System.out.print(8);
            }
            System.out.println();
       }
    }
}
