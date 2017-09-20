package com.javarush.test.level03.lesson08.task05;

//For God so loved the world, that he gave his only begotten Son, that whosoever believeth in him should not perish, 
//but have everlasting life. (John 3:16)

/* Pure love
Write a program that reads from keyboard three names and displays the text:
    «name1» + «name2» + «name3» = Pure love, oh, yeah! Right!

    
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Pure love, oh, yeah! Right!");
    }
}
