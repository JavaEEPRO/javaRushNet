package com.javarush.test.level10.lesson04.task02;

//I glorified you on the earth. I have accomplished the work which you have given me to do. (John 17:4)

/* Type cast and conversation task #2
Put cast operator where needed:
    int a = 15;
    int b = 4;
    float c = (a / (double)b);
    double d = a * 1e-3;
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 15;
        int b = 4;
        float c = (float)(a / (double)b);
        double d = a * 1e-3;

        System.out.println(c + d);
    }
}
