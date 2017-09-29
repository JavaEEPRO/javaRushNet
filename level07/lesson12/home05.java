package com.javarush.test.level07.lesson12.home05;

//Then the maid who kept the door said to Peter, "Are you also one of this man's disciples?" He said, "I am not." (John 18:17)

/* Bang!
Write a program that counts down from 30 to 0, and displays «Bang!» at the end. The program
should reduce the number 10 times per second. Use the function below to insert a delay:
    Thread.sleep(100); //delay of one tenth of a second.
    Example:
    30
    29
    …
    1
    0
    Bang!
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i=30;i>=0;i--)
        {
            System.out.println(i);

            Thread.sleep(100);//add your code here
        }

        System.out.println("Bang!");
    }
}
