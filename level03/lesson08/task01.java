package com.javarush.test.level03.lesson08.task01;

//After these things I looked and saw a door opened in heaven, and the first voice that I heard, 
//like a trumpet speaking with me, was one saying, "Come up here, and I will show you the things which must happen after this."
//(Revelation 4:1)

/* How to conquer the world
Write a program that reads from keyboard a name and a number and displays the text:
    «name» will conquer the world in «number» years. Bwahaha!
    (The sequence of input data is important.)

    Example:
    Joe will conquer the world in 8 years. Bwahaha!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String n = br.readLine();
        String nam = br.readLine();
        int num = Integer.parseInt(n);
        System.out.print(nam + " will conquer the world in " + num + " years. Bwahaha!");
    }
}
