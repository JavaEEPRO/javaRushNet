package com.javarush.test.level08.lesson06.task02;

//Therefore Jesus perceived that they wanted to ask him, and he said to them, "Do you inquire among yourselves concerning this,
//that I said, 'A little while, and you won't see me, and again a little while, and you will see me?'(John 16:19)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Do ten thousand insertions and deletions
Do ten thousand of each insertions, deletions, calls of get() and set() methods for the arrayList and linkedList.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list)
    {
        for (int i = 0; i < 10000; i++){//add your code here
            list.add(i,i);
        }
    }

    public static void get10000(List list)
    {
        for (int i = 0; i < 10000; i++){//add your code here
            list.get(i);
        }
    }

    public static void set10000(List list)
    {
        for (int i = 0; i < 10000; i++){//add your code here
            list.set(i,i);
        }
    }

    public static void remove10000(List list)
    {
        for (int i = 9999; i > -1; i--){//add your code here
            list.remove(i);
        }
    }
}

