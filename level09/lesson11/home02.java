package com.javarush.test.level09.lesson11.home02;

//But you have a custom, that I should release someone to you at the Passover. 
//Therefore do you want me to release to you the King of the Jews? (John 18:39)

/* Countdown from 10 to 0
Write a loop to countdown from 10 to 0. Use Thread.sleep(100) to make a delay;
    Wrap the sleep call into a try..catch.
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 10; i >= 0; i--)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(100);//add your code here
            }catch (InterruptedException e) {System.out.println(e);}
        }
    }
}
