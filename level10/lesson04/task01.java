package com.javarush.test.level10.lesson04.task01;

//Then Pilate went out again, and said to them, "Behold, I bring him out to you, 
//that you may know that I find no basis for a charge against him." (John 19:4)

/* Type cast and conversation task #1
Put cast operator where needed:
    byte a = 1234;
    int b = a;
    byte c = a * a;
    int d = a / c;
*/

public class Solution
{
    public static void main(String[] args)
    {
        byte a = (byte)1234;
        int b = a;
        byte c = (byte)(a * a);
        int d = a / c;
    }
}
