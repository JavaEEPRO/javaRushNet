package com.javarush.test.level04.lesson13.task05;

//No longer do I call you servants, for the servant doesn't know what his lord does. 
//But I have called you friends, for everything that I heard from my Father, I have made known to you. (John 15:15)

import java.io.*;

/* Everybody loves somebody
Write a program that reads from keyboard name. Use “for” loop to display 10 times the text:
    «name» loves me.

    Example text:
    Pam loves me.
    Pam loves me.
    …
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //add your code here
       String name = bufferedReader.readLine();
       for (int i = 0; i < 10; i++) {
           System.out.println(name + " loves me.");
       }
    }
}
