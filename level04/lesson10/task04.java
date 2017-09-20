package com.javarush.test.level04.lesson10.task04;

//I pray for them. I don't pray for the world, but for those whom you have given me, for they are yours. (John 17:9)

import java.io.*;

/* S-square
Write a program that displays to the screen a square 10x10 of “S” characters. Use “while” loop.
    Don’t separate characters in the same line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int i=0, j=0; //add your code here
       while (i<10){
           while (j<10){
               System.out.print("S");
               j++;
           }
           System.out.println();
           j=0;
           i++;
       }

    }
}
