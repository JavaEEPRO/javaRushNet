package com.javarush.test.level10.lesson04.task03;

//Jesus therefore came out, wearing the crown of thorns and the purple garment. Pilate said to them, "Behold, the man!" (John 19:5)

/* Type cast and conversation task #3
Put cast operator where needed:
    float f = 333.50;
    int i = f;
    byte b = i;
*/

public class Solution
{
    public static void main(String[] args)
    {
        float f = (float)333.50;
        int i= (int)f;
        byte b = (byte)i;
    }
}
