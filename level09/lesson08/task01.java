package com.javarush.test.level09.lesson08.task01;

//Now we know that you know all things, and don't need for anyone to question you.
//By this we believe that you came forth from God." (John 16:30)

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import java.util.HashMap;

/* Exceptions
There’s a method that throws two exceptions inherited from Exception, and the other two inherited from RuntimeException: NullPointerException, ArithmeticException, FileNotFoundException, and URISyntaxException.

    You need to catch NullPointerException and FileNotFoundException, but not to catch ArithmeticException and URISyntaxException. How to do it?
*/

public class Solution
{
    public static void main(String[] args) throws ArithmeticException, URISyntaxException
    {
        try{//add your code here

        method1();

        }catch (FileNotFoundException e) {System.out.println(e);}//add your code here
    catch (NullPointerException e) {System.out.println(e);}

    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException
    {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
