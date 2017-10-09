package com.javarush.test.level08.lesson11.bonus03;

//Until now, you have asked nothing in my name. Ask, and you will receive, that your joy may be made full. (John 16:24)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Learning and practicing algorithm.
Task: The program should read from the keyboard 20 words and display them in alphabetical order.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<String> list = new ArrayList<String>();//add your code here
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    //String compare method: '?' greater then 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
