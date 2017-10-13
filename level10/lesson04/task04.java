package com.javarush.test.level10.lesson04.task04;

//And now, O Father, glorify thou me with thine own self with the glory which I had with thee before the world was (John 17:5)

/* Type cast and conversation task #4
Put cast operator where needed:
    short number = 9;
    char zero = '0';
    char nine = zero + number;
*/

public class Solution
{
    public static void main(String[] args)
    {
        short number = 9;
        char zero = '0';
        char nine = (char)(zero + number);
    }
}
