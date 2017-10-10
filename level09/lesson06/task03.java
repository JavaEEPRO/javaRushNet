package com.javarush.test.level09.lesson06.task03;

//Pilate therefore said to him, "Are you a king then?" Jesus answered, "You say that I am a king. 
//For this reason I have been born, and for this reason I have come into the world, that I should testify to the truth.
//Everyone who is of the truth listens to my voice." (John 18:37)


/* Exception when operating with arrays
Catch the exception that occurs when run the code:
    int[] m = new int[2];
    m[8] = 5;
    Display the exception to the screen, specifying its type.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       try{ //add your code here

        int[] m = new int[2];
        m[8]= 5;

        }catch (IndexOutOfBoundsException e) {System.out.println(e);}//add your code here

    }
}
