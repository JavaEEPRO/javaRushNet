package com.javarush.test.level04.lesson10.task03;

//I have spoken these things to you, that my joy may remain in you, and that your joy may be made full. (John 15:11)

import java.io.*;

/* You can never have too much of a good thing
Write a program that reads from keyboard a string and number N.
    Program should display to the screen the string N times. Use “while” loop.
    Example input:
    abc
    2
    Example output:
    abc
    abc
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //add your code here
       String s = br.readLine();
       String x = br.readLine();
       int n = Integer.parseInt(x);
       while(n>0){
           System.out.println(s);
           n--;
       }
    }
}
