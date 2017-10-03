package com.javarush.test.level08.lesson03.task01;

//They said therefore, "What is this that he says, 'A little while?' We don't know what he is saying." (John 16:18)

import java.util.*;
/* A plant HashSet
Create a HashSet collection of String type elements.
    Add to the collection 10 strings: watermelon, banana, cherry, pear, melon, blackberry, ginseng, strawberry, iris, and potato.
    Display to the screen the contents of the collection. Each entry should be on a new line.
    Watch how changed the order of added elements.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> set = new HashSet<String>();//add your code here
        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("melon");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");
        
        for(String element: set){
            System.out.println(element);
        }
    }
}
