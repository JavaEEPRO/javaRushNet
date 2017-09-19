package com.javarush.test.level03.lesson04.task05;

//They sang the song of Moses, the servant of God, and the song of the Lamb, saying, "Great and marvelous are your works, Lord God,
//the Almighty! Righteous and true are your ways, you King of the nations. (Revelation 15:3)

/* The sum of 10 numbers
Write a program that displays the sum of numbers from 1 to 10 by lines:
    1
    1+2=3
    1+2+3=6
    1+2+3+4=10
    …
    Example output:
    1
    3
    6
    10
    …
*/

public class Solution
{
    public static void main(String[] args)
    {  int sum = 1;
       for (int i = 2; i < 12; i++) { //add your code here
       System.out.println(sum);
       sum +=i;
       }    
    }
}
