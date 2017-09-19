package com.javarush.test.level03.lesson06.task04;

//Now you are clean by reason of the word, which I have spoken to you. (John 15:3)

/* Escape character
Read about escape character in Java in additional material to the lecture.

    Write a program that displays following two strings:
    It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
    It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println("It\'s Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");//add your code here
        System.out.println("It\'s Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}
