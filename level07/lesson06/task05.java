package com.javarush.test.level07.lesson06.task05;

//Then the band and the captain and officers of the Jews took Jesus, and bound him (John 18:12)

import java.util.Scanner;
import java.util.ArrayList;
/* Delete the last string and add it to the beginning of the list
1. Create a list of strings.
    2. Read from keyboard 5 strings. Add these strings to the list.
    3. Delete the last string and add it to the beginning of the list. Repeat this action 13 times.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);//add your code here
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            String moved = list.get(4);
            list.add(0,moved);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
