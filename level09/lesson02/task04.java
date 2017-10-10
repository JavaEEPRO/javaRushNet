package com.javarush.test.level09.lesson02.task04;

//for the Father himself loves you, because you have loved me, and have believed that I came forth from God.(John 16:27)

/* Stack trace of 10 calls
Write code to get a stack trace of 10 calls.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        return method2();
    }

    public static StackTraceElement[] method2()
    {
       return method3(); //add your code here

    }

    public static StackTraceElement[] method3()
    {
        return method4();//add your code here

    }

    public static StackTraceElement[] method4()
    {
        return method5();//add your code here

    }

    public static StackTraceElement[] method5()
    {
        return method6();//add your code here

    }

    public static StackTraceElement[] method6()
    {
        return method7();//add your code here

    }

    public static StackTraceElement[] method7()
    {
        return method8();//add your code here

    }

    public static StackTraceElement[] method8()
    {
        return method9();//add your code here

    }

    public static StackTraceElement[] method9()
    {
        return method10();
    }

    public static StackTraceElement[] method10()
    {
        return Thread.currentThread().getStackTrace();
    }
}
