package com.javarush.test.level01.lesson04.task02;

//And now I am no more in the world, but these are in the world, and I come to thee. 
//Holy Father, keep through thine own name those whom thou hast given me, that they may be one, as we are. (John 17:11)

import java.lang.String;

/* I don't get excited by money, they soothe me
Write a program that displays «I don't get excited by money, they soothe me.» 10 times.
*/
public class Solution
{
    public static void main(String[] args)
    {
     for(int i = 0; i < 2; i++){
        print5Times("I don't get excited by money, they soothe me.");
    }//add your code here
    }


    public static void print5Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
