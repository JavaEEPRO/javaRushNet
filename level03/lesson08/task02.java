package com.javarush.test.level03.lesson08.task02;

//And he shewed me a pure river of water of life, clear as crystal, proceeding out of the throne of God and of the Lamb.(Rev.22:1)

/* Salary in 5 years
Write a program that reads from keyboard a name and two numbers. Program should display the text:
    «name» earns «number1» in «number2» years.

    Example:
    Nick earns $150,000 in 5 years.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));           String nam = br.readLine();//add your code here
        String num = br.readLine();
        String tim = br.readLine();
        System.out.println(nam + " earns " + num + " in " + tim + " years.");
    }
}
