package com.javarush.test.level07.lesson06.task04;

//about judgment, because the prince of this world has been judged.(John 16:11)

import java.util.Scanner;
import java.util.ArrayList;
/* Add 5 strings to the beginning of the list
1. Create a list of strings.
    2. Read from the keyboard 5 strings. Add these strings to the beginning of the list, not to the end.
    3. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();   
        Scanner scanner = new Scanner(System.in); //add your code here
        for (int i = 0; i < 5; i++) {
            list.add(0,scanner.nextLine());
        }     
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
