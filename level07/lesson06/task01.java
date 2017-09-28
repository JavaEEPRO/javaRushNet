package com.javarush.test.level07.lesson06.task01;

//about righteousness, because I am going to my Father, and you won't see me any more (John 16:10)

import java.util.ArrayList;

/* 5 different strings in a list
1. Create a list of strings.
    2. Add 5 different strings to the list.
    3. Display to the screen its size.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>(); //add your code here
        for (int i = 0; i < 5; i++) {
            list.add("some string"+i);
        }
        System.out.println(list.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
