package com.javarush.test.level03.lesson04.task04;

//Then came the first, saying, Lord, thy pound hath gained ten pounds.  (Luke 19:16)

/* The product of 10 numbers
Write a program that displays the product of numbers from 1 to 10.
    Hint: it’s three million and a little more
*/

public class Solution
{
    public static void main(String[] args)
    {   int product = 1;
        for (int i = 1; i < 11; i++) {//add your code here
        
        product *= i;
        }
        System.out.println(product);
    }
}
