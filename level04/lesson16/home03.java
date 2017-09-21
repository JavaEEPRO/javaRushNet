package com.javarush.test.level04.lesson16.home03;

//These things I command you, that ye love one another. (John 15:17)

import java.io.*;
import java.util.Scanner;

/* Calculate a sum
Write a program that reads from keyboard numbers and calculates their sum.
    If the user enters -1, the program should display the sum and terminate. -1 should be included in sum.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scanner = new Scanner(System.in); //add your code here
        int sum = 0, x = 0 ;
        while (x!=-1) {
            x = scanner.nextInt();
            sum += x;
        }
        System.out.print(sum);
    }
}
