

//They led Jesus therefore from Caiaphas into the Praetorium. It was early, and they themselves didn't enter into the Praetorium,
//that they might not be defiled, but might eat the Passover.(John 18:28)


package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Identical first and last names
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Check how many people have the same first or last name as the name specified.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();//add your code here
        map.put("Peter","Seemon");
        map.put("Paul","Tarsian");
        map.put("Andrew","Brother");
        map.put("Judah","Brother");
        map.put("Thomas","Apostle");
        map.put("Philip","Fisher");
        map.put("Judah1","Iscariotus");
        map.put("John","Beloved");
        map.put("James","Beloved");
        map.put("James1","Zebeedeeth");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int counter = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {//add your code here
            if(pair.getValue().equals(name)){counter++;}
        }
        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int counter = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {//add your code here
            if(pair.getKey().equals(familiya)){counter++;}
        }
        return counter;

    }
}
