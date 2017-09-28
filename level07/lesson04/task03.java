package com.javarush.test.level07.lesson04.task03;

//All we like sheep have gone astray; we have turned every one to his own way; 
//and the LORD hath laid on him the iniquity of us all. (Isaijah 53:6)

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 arrays
1. Create one array of 10 strings.
    2. Create another array of 10 numbers.
    3. Read from the keyboard 10 strings and fill the string array with them.
    4. Write the length of a string from each cell of the string array in the cell of numbers array with the same index.  Display to the screen the contents of the array of numbers. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       String[] sArray = new String[10];
       int[] iArray = new int[10];//add your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       for (int i = 0; i < 10; i++) {
           sArray[i] = br.readLine();
           iArray[i] = sArray[i].length();
       }
       for (int i = 0; i < 10; i++) {
           System.out.println(iArray[i]);
       }
    }
}
