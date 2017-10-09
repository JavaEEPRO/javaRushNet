

//And in that day ye shall ask me nothing. Verily, verily, I say unto you,
//Whatsoever ye shall ask the Father in my name, he will give it you (John 16:23)


package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Five largest numbers
Create an array of 20 numbers. Fill it with numbers that are read from keyboard.
Display to the screen five largest numbers.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        int max = array[0];//add your code here
        int maxIndex = 0;

        for (int j = 0; j < 5; j ++)
        {

            for (int i = 0+j; i < 20; i++)
            {
                if (array[i] > max)
                {
                    max = array[i];
                    maxIndex = i;
                }
            }

            array[maxIndex] = array[j];
            array[j] = max;
            max = array[j+1];
            maxIndex = j+1;
        }
    }
}
