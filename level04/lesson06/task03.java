package com.javarush.test.level04.lesson06.task03;

//I revealed your name to the people whom you have given me out of the world. They were yours, and you have given them to me.
//They have kept your word.(John 17:6)

/* Sort three numbers
Write a program that reads three numbers from keyboard and displays them in descending order.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);//add your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a>b && b>c){System.out.println(a + " " + b + " " + c);}
        else if(b>a && a>c){System.out.println(b + " " + a + " " + c);}
        else if(c>b && b>a){System.out.println(c + " " + b + " " + a);}
        else if(c>a && a>b){System.out.println(c + " " + a + " " + b);}
        else if(b>c && c>a){System.out.println(b + " " + c + " " + a);}
        else System.out.println(a + " " + c + " " + b);
    }
}
