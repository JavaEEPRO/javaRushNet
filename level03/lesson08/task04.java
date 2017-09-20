package com.javarush.test.level03.lesson08.task04;

//Abide in me, and I in you. As the branch cannot bear fruit of itself, except it abide in the vine;
//no more can ye, except ye abide in me. (John 15:4)

/* Sponsor! That has a proud sound!
Write a program that reads from keyboard two names and displays the text:
    «name1» sponsored «name2», and she became a famous singer.

    Example:
    Nick sponsored Helen, and she became a famous singer.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);//add your code here
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        System.out.println(name1 + " sponsored " + name2 + ", and she became a famous singer.");
    }
}
