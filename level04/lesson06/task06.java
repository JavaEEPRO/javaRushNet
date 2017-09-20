package com.javarush.test.level04.lesson06.task06;

//Even as the Father has loved me, I also have loved you. Remain in my love (John 15:9)

/* 18 is enough
Write a program that reads a name and age from keyboard.
    If the age is more than 20 display «18 is enough»
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       Scanner scanner = new Scanner(System.in); //add your code here
       String name = scanner.nextLine();
       int age = scanner.nextInt();
       if (age>20){System.out.println("18 is enough");}
    }
}
