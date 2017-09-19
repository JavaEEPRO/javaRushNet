package com.javarush.test.level02.lesson08.task06;

//Now I have told you before it happens so that, when it happens, you may believe.(John 14:29)

/* Text display
Write a function that displays the passed string (word) three times in the same line.
    Words must be separated by a space and don't have to merge into one.
*/
public class Solution
{
    public static void print3(String s)
    {
        System.out.print(s+" "+s+" "+s);//add your code here
        System.out.println("");
    }
    public static void main(String[] args)
    {
        print3("window");
        print3(" file");
    }
}
