package com.javarush.test.level03.lesson12.home03;

//For God sent not his Son into the world to condemn the world; but that the world through him might be saved. (John 3:17)

/* I will earn $50 per hour
Write a program that reads from keyboard a number n and displays «I will earn $n per hour».

    Example:
    I will earn $50 per hour
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //add your code here
        String n = br.readLine();
        System.out.println("I will earn $" + n + " per hour");
    }
}
