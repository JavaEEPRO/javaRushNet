package com.javarush.test.level09.lesson06.task01;

//Jesus answered, "My Kingdom is not of this world. If my Kingdom were of this world, then my servants would fight,
//that I wouldn't be delivered to the Jews. But now my Kingdom is not from here." (John 18:36)

/* Exception when operating with numbers
Catch the exception that occurs when run the code:
    int a = 42 / 0;
    Display the exception to the screen, specifying its type.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try{//add your code here

         int a = 42/0;

        }catch (ArithmeticException e){System.out.println(e);}//add your code here

    }
}
