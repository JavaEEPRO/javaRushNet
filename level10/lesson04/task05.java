package com.javarush.test.level10.lesson04.task05;

//When therefore the chief priests and the officers saw him, they shouted, saying, 
//"Crucify! Crucify!" Pilate said to them, "Take him yourselves, and crucify him, 
//for I find no basis for a charge against him." (John 19:6)

/* Type cast and conversation task #5
Put cast operator where needed:
    short number = 9;
    char zero = '0';
    short nineCode = zero + number;
*/

public class Solution
{
    public static void main(String[] args)
    {
        short number = 9;
        char zero = '0';
        short nineCode = (short)(zero + number);
    }
}
