package com.javarush.test.level03.lesson06.task01;

//After this I looked, and, behold, a door was opened in heaven: and the first voice which I heard was as it were of a 
//trumpet talking with me; which said, Come up hither, and I will shew thee things which must be hereafter. (Revelation 4:1)

/* Stop look listen
Write a program that displays all possible combinations of words «Stop», «Look», «Listen».
    Hint: there are 6 variants. Display each combination in a new line. Do not separate words.

    Example:
    LookListenStop
    ListenStopLook
    ...
*/

public class Solution
{
    public static void main(String[] args)
    {
       String a = "Look", b = "Listen", c = "Stop"; //add your code here
       System.out.println(a+b+c);
       System.out.println(a+c+b);
       System.out.println(b+a+c);
       System.out.println(b+c+a);
       System.out.println(c+b+a);
       System.out.println(c+a+b);
    }
}
