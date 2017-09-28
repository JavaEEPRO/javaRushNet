package com.javarush.test.level07.lesson04.task04;

//He was oppressed, and he was afflicted, yet he opened not his mouth: 
//he is brought as a lamb to the slaughter, and as a sheep before her shearers is dumb, so he openeth not his mouth (Isaijah 53:07)

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Array of numbers in reverse order
1. Create an array of 10 numbers.
    2. Read from the keyboard 10 numbers and store them in the array.
    3. Arrange array elements in reverse order.
    4. Display to the screen the result. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[10];//add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 9; i > -1; i--) {
            System.out.println(array[i]);
        }
    }
}
