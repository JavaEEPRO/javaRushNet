package com.javarush.test.level04.lesson16.home04;

//But now I come to you, and I say these things in the world, that they may have my joy made full in themselves. (John 17:13)

import java.io.*;
import java.util.Scanner;

/* My name's ‘Joe’...
Write a program that reads from keyboard a string «name» and a date of birth (three numbers): y, m, d.
    The program should display to the screen:
    «My name's «name»
    I was born on d.m.y»

    Example:
    «My name's Joe
    I was born on 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner sc = new Scanner(System.in);//add your code here
        String name = sc.nextLine();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("My name's " + name + "\n" +
                "I was born on " + d + "." + m + "." + y);
    }
}
