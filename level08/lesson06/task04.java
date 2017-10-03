package com.javarush.test.level08.lesson06.task04;

//Verily, verily, I say unto you, That ye shall weep and lament, but the world shall rejoice: and ye shall be sorrowful, 
//but your sorrow shall be turned into joy.(John 16:20)

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Measure time needed to do ten thousand calls of get for each list
Measure time needed to do ten thousand calls of get() for each list
    The method getTimeMsOfGet() should return the time of its execution in milliseconds.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    private static List fill(List list)
    {
        for(int i = 0; i < 11; i++)
        {
            list.add(new Object());
        }
        return list;
    }

    public static long  getTimeMsOfGet(List list)
    {
        Date preTime = new Date();//add your code here

        get10000(list);

        Date postTime = new Date();//add your code here
        
        return (postTime.getTime() - preTime.getTime());
    }

    public static void get10000(List list)
    {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++)
        {
            list.get(x);
        }
    }
}
