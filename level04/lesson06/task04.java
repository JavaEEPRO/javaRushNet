package com.javarush.test.level04.lesson06.task04;

//In this is my Father glorified, that you bear much fruit; and so you will be my disciples. (John 15:8)

/* Compare names
Write a program that reads two names from keyboard, and if the names are the same, displays «Names are identical».
    Display «Name lengths are equal» if the names are different, but their lengths are equal.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String a = br.readLine();
        String b = br.readLine();
        if (a.equals(b)){System.out.println("Names are identical");}
        else if (a.length()==b.length()){System.out.println("Name lengths are equal");}

    }
}
