package com.javarush.test.level09.lesson06.task02;

//I came out from the Father, and have come into the world. Again, I leave the world, and go to the Father." (John 16:28)

/* Exception when operating with strings
Catch the exception that occurs when run the code:
    String s = null;
    String m = s.toLowerCase();
    Display the exception to the screen, specifying its type.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try{//add your code here

        String s = null;
        String m = s.toLowerCase();

        }catch (NullPointerException e) {System.out.println(e);}//add your code here

    }
}
