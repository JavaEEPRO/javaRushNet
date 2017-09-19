package com.javarush.test.level03.lesson06.task02;

//And immediately I was in the spirit: and, behold, a throne was set in heaven, and one sat on the throne. (Revelation 4:2)

/* Multiplication table
Write a program that displays the multiplication table 10 by 10 as follows:
    1 2 3 …
    2 4 6 …
    3 6 9 …
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
       for (int i = 1; i < 11; i++) { //add your code here
            for (int j = 1; j < 11; j++) {
                System.out.print(i*j+" ");
            }
                System.out.println();
       }
    }
}
