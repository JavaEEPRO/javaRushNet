package com.javarush.test.level07.lesson12.bonus03;

//The high priest therefore asked Jesus about his disciples, and about his teaching. (John 18:19)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Learning and practicing algorithm.
Task: Read from the keyboard 20 numbers and display them in descending order.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){//add your code here
            list.add(array[i]);
        }
        Collections.sort(list, Collections.<Integer>reverseOrder());
        for (int i = 0; i < array.length; i++){
            array[i] = list.get(i);
        }
    }
}
