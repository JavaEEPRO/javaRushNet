package com.javarush.test.level03.lesson08.task03;

//But the wisdom that is from above is first pure, then peaceful, gentle, reasonable, 
//full of mercy and good fruits, without partiality, and without hypocrisy. (James 3:17)

/* Modesty adorns a man
Write a program that reads from keyboard a name and displays the text:
    «name» earns $15,000 per month. Haw-haw!

    Example:
    Tim earns $15,000 per month. Haw-haw!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String name = br.readLine();
        System.out.println(name + " earns $15,000 per month. Haw-haw!");
    }
}
