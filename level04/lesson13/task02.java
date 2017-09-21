package com.javarush.test.level04.lesson13.task02;

//I pray for them. I don't pray for the world, but for those whom you have given me, for they are yours. (John 17:9)

import java.io.*;
import java.util.Scanner;

/* Draw a rectangle
Write a program that reads from keyboard two numbers: m and n.
    The program should display to the screen a rectangle composed of eights sized m by n. Use “for” loop.

    Example: m=2, n=4
    8888
    8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);//add your code here
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
