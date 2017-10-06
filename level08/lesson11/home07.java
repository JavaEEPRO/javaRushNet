package com.javarush.test.level08.lesson11.home07;

//"In that day you will ask me no questions. Most certainly I tell you, whatever you may ask of the Father in my name,
// will give it to you.(John 16:23)

/* Move one modifier static
Move one static modifier so the code compiles.
*/

public class Solution
{
    public static int A = 5;
    public  static int B = 2;

    public int C = A*B;
    public  static int D = B*A;

    public static void main(String[] args)
    {
    }

    public  int getValue()
    {
        return D;
    }

    public int getValue2()
    {
        return C;
    }
}
