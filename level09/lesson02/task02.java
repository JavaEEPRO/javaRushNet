package com.javarush.test.level09.lesson02.task02;

//I have spoken these things to you in figures of speech. But the time is coming when 
//I will no more speak to you in figures of speech, but will tell you plainly about the Father. (John 16:25)

/* StackTrace again
Write five methods that call each other. Each method should return the name of its caller method.
    You can obtain caller method using StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace(); 
        StackTraceElement element = stackTraceElements[2] ; 
        return element.getMethodName();//add your code here
    }

    public static String method2()
    {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace(); 
        StackTraceElement element = stackTraceElements[2] ; 
        return element.getMethodName();//add your code here
    }

    public static String method3()
    {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace(); 
        StackTraceElement element = stackTraceElements[2] ; 
        return element.getMethodName();//add your code here
    }

    public static String method4()
    {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace(); 
        StackTraceElement element = stackTraceElements[2] ; 
        return element.getMethodName();//add your code here
    }

    public static String method5()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace(); 
        StackTraceElement element = stackTraceElements[2] ; 
        return element.getMethodName();//add your code here
    }
}
