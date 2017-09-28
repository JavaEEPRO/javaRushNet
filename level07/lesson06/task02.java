package com.javarush.test.level07.lesson06.task02;

//Then Simon Peter having a sword drew it, and smote the high priest's servant, and cut off his right ear. 
//The servant's name was Malchus (John 18:10)

import java.util.ArrayList;
/* 5 lines: «101», «102», «103», «104», «105»
1. Create a list of strings.
    2. Add 5 strings to the list. «101», «102», «103», «104», «105».
    3. Delete the first one, the middle one and the last one.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
    5. Display to the screen its size. (After deleting one entry, the indexes of other entries change. For instance, if we delete first element, the second becomes the first one).
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();//add your code here
        for (int i = 0; i < 5; i++) {
            int x = 101 + i;
            String y = x + "";
            list.add(y);
        }
        list.remove(0);
        list.remove(1);
        list.remove(2);
        for (int i = 0; i < 2; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
    }
}
