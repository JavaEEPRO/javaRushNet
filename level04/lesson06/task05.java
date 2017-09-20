package com.javarush.test.level04.lesson06.task05;

Now they have known that all things whatever you have given me are from you (John 17:7)

/* 18+
Write a program that reads a name and age from keyboard. If the age is less than 18 display «Grow up a little»
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);//add your code here
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age<18) {System.out.println("Grow up a little");}
    }
}
