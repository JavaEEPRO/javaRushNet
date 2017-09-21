package com.javarush.test.level04.lesson16.home02;

//While I was with them in the world, I kept them in your name. Those whom you have given me I have kept. 
//None of them is lost, except the son of destruction, that the Scripture might be fulfilled. (John 17:12)

import java.io.*;
import java.util.Scanner;

/* Display an average
Write a program that reads from keyboard three numbers.
    The program should display to the screen the average of these numbers, that is, neither the biggest nor the smallest one.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scanner = new Scanner(System.in);//add your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int average;
        if (a>b && c>a) {average = a;}
        else if (a<b && c<a) {average = a;}
        else if (b>a && c>b) {average = b;}
        else if (b<a && c<b) {average = b;}
        else average = c;
        System.out.println(average);
    }
}
