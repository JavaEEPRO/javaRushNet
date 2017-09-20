package com.javarush.test.level04.lesson10.task05;

//This is my commandment, That ye love one another, as I have loved you. (John 15:12)

import java.io.*;

/* Multiplication table
Write a program that displays multiplication table of 10 by 10. Use “while” loop.
    Separate numbers by a space.
    1 2 3 4 5 6 7 8 9 10
    2 4 6 8 10 12 14 16 18 20
    ...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 1, j = 1;//add your code here
        while (i < 11) {
            while (j < 11) {
                System.out.print(i*j + " ");
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }

    }
}
