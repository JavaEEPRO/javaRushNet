package com.javarush.test.level04.lesson06.task01;

//And now, O Father, glorify thou me with thine own self with the glory which I had with thee before the world was.(John 17:5)

/* Minimum of two numbers
Write a program that reads two numbers from keyboard and displays to the screen the minimum of these numbers.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String a = br.readLine();
        int x = Integer.parseInt(a);
        String b = br.readLine();
        int y = Integer.parseInt(b);
        int result;
        if(x<y){result = x;}
        else{result = y;}
        System.out.println(result);
    }
}
