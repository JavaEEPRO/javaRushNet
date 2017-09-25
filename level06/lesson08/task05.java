package com.javarush.test.level06.lesson08.task05;

//But I have told you these things, so that when the time comes, you may remember that I told you about them. 
//I didn't tell you these things from the beginning, because I was with you.(John 16:4)

/* Class StringHelper
Write a class StringHelper, which will have 2 static methods:
    - String multiply(String s, int count) should return the string s repeated count times.
    - String multiply(String s) should return the string s repeated 5 times.

    Example:
    Amigo -> AmigoAmigoAmigoAmigoAmigo
*/

public class StringHelper
{
    public static String multiply(String s)
    {
        String result = "";
        for (int i = 0; i < 5; i++){//add your code here
        result += s;
        }
        return result;
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        for (int i = 0; i < count; i++){//add your code here
        result += s;
        }
        return result;
    }
}
