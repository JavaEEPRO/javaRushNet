package com.javarush.test.level02.lesson08.task02;

//But he who is greatest among you will be your servant. (Matthew 23:11)
//Больший из вас да будет вам слуга

/* Maximum of two numbers
Write a function that returns a maximum of two numbers.
*/
public class Solution
{
    public static int max(int a, int b)
    {
        if (a>b){//add your code here
        return a;}
        else{return b;}
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( max(10,20) );
        System.out.println( max(-10,-20) );
        System.out.println( max(-100,0) );
    }

}
