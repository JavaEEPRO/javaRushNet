package com.javarush.test.level08.lesson08.task02;

//Peter therefore denied it again, and immediately the rooster crowed.(John 18:27)

import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.Iterator;

/* Remove all the numbers greater than 10
Create a set of numbers (Set<Integer>), place into it 20 different numbers.
    Remove from the set all the numbers greater than 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();//add your code here
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            int numb = random.nextInt(144000);
            set.add(numb);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //add your code here
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            int num = iterator.next();
            if (num > 10)
                iterator.remove();
        }
        return set;
    }
}
