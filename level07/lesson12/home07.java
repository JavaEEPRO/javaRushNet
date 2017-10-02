package com.javarush.test.level07.lesson12.home07;

//Then some of the disciples said one to another: What is this that he saith to us: A little while, and you shall not see me;
//and again a little while, and you shall see me, and, because I go to the Father?(John 16:17)

/* Move one modifier static
Move one static modifier so the program compile.
*/

public class Solution
{
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A*B;

    public static void main(String[] args)
    {
    }

    public int getValue()
    {
        return C;
    }

}

