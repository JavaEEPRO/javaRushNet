package com.javarush.test.level09.lesson02.task05;


//Pilate answered, "I'm not a Jew, am I? 
//Your own nation and the chief priests delivered you to me. What have you done?" (John 18:35)


/* The method should return a result - its stack trace depth
Write a method that displays and returns its stack trace depth. Stack trace depth is the number of its methods (the number of elements in the list).
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();//add your code here
        return stackTraceElements.length;

    }
}
