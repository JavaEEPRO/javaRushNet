package com.javarush.test.level06.lesson11.home03;

//They answered him, "Jesus of Nazareth." Jesus said to them, "I am he." Judas also, who betrayed him, was standing with them. (John 18:5)

/* Move one static modifier
Move one static modifier so the code compiles.
*/

public class Solution
{

    public static int A = 5;
    public int B = 2;
    public  int C = A*B;

    public static void main(String[] args)
    {
        A = 15;
    }

}
