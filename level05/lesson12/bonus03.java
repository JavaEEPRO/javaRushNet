package com.javarush.test.level05.lesson12.bonus03;

//Righteous Father, the world hasn't known you, but I knew you; and these knew that you sent me.(John 17:25)

import java.io.*;

/* Learning and practicing algorithm
Task: Write a program that
    1. reads from the console number N > 0
    2. then reads from the console N numbers
    3. displays the maximum of N numbers typed in.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int next, quantity, maximum = 0; //add your code here
        quantity = Integer.parseInt(reader.readLine());
        if (quantity > 0)
        {
            for (int i = 0; i < quantity; i++)
            {
                next = Integer.parseInt(reader.readLine());
                if(i == 0){maximum = next;}
                if (next > maximum)
                {
                    maximum = next;
                }
            }
            System.out.println(maximum);
        }
    }
}
