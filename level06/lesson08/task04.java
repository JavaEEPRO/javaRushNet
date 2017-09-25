package com.javarush.test.level06.lesson08.task04;

//Judas then, having taken a detachment of soldiers and officers from the chief priests and the Pharisees,
//came there with lanterns, torches, and weapons.(John 18:3)

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Class ConsoleReader
Write a class ConsoleReader, which will have 4 static methods:
    - String readString() to read strings from keyboard
    - int readInt() to read numbers from keyboard
    - double readDouble() to read fractional numbers from keyboard
    - void readLn() to wait for pressing enter [use readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//add your code here
        return br.readLine();
    }

    public static int readInt() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//add your code here
        return Integer.parseInt(br.readLine());
    }

    public static double readDouble() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//add your code here
        return Double.parseDouble(br.readLine());
    }

    public static void readLn() throws Exception
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//add your code here
         System.in.read();
    }
}
