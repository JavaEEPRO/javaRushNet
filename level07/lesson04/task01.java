package com.javarush.test.level07.lesson04.task01;

// He was taken from prison and from judgment: and who shall declare his generation? 
//for he was cut off out of the land of the living: for the transgression of my people was he stricken. (Isaijah 53:08)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Maximum of an array of 20 numbers
1. In the method initializeArray():
    1.1. Create an array of 20 numbers
    1.2. Read from the keyboard 20 numbers and fill the array with them
    2. The method max(int[] array) should find the maximum number of the elements of the array
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];//Initialize (create and fill) an array here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < 20; i++) {//Find the max value here
        if (array[i]>max){max = array[i];}
        }
        return max;
    }
}
