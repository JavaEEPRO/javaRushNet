package com.javarush.test.level07.lesson12.home03;

//but Peter was standing at the door outside. So the other disciple, who was known to the high priest,
//went out and spoke to her who kept the door, and brought in Peter. (John 18:16)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Largest and smallest number in an array
Create an array of 20 numbers.
    Fill it with numbers that are read from keyboard.
    Find the largest and smallest number in an array.
    Display to the screen the largest and smallest numbers separated by a space.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int  maximum;
        int  minimum;
        ArrayList<Integer> list = new ArrayList<Integer>();//add your code here
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        maximum = list.get(0);
        minimum = list.get(0);
        for (int i = 0; i < 20; i++) {
            if (list.get(i)>maximum){maximum = list.get(i);}
            if (list.get(i)<minimum){minimum = list.get(i);}
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
