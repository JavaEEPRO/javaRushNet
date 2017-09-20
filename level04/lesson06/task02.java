package com.javarush.test.level04.lesson06.task02;

//If you remain in me, and my words remain in you, you will ask whatever you desire, and it will be done for you. (John 15:7)

/* Maximum of four numbers
Write a program that reads four numbers from keyboard and displays to the screen the maximum of these numbers.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    Scanner scanner = new Scanner(System.in);    //add your code here
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    int result;
    if (a>b && a>c && a>d){result = a;}
    else if (b>a && b>c && b>d){result = b;}
    else if (c>a && c>b && c>d){result = c;}
    else result = d;
    System.out.println(result);
    }
}
