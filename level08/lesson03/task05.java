package com.javarush.test.level08.lesson03.task05;

//When he had said this, one of the officers standing by slapped Jesus with his hand, saying, 
//"Do you answer the high priest like that?"(John 18:22)

import java.util.HashMap;
import java.util.Map;

/* Display to the screen the list of values
There is a collection HashMap<String, String>, it already has 10 different strings.
    Display to the screen the list of values. Each entry should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map)
    {
        for(Map.Entry<String, String>pair : map.entrySet()){//add your code here
            System.out.println(pair.getValue());
        }
    }

}
