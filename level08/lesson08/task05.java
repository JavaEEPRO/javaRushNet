package com.javarush.test.level08.lesson08.task05;

//Verily, verily, I say unto you, That ye shall weep and lament, but the world shall rejoice: 
//and ye shall be sorrowful, but your sorrow shall be turned into joy (John 16:20)

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* Remove people having the same first name
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Remove people that have the same first name.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();//add your code here
        map.put("Someone","John");
        map.put("Somebrother","Jacob");
        map.put("Somewho","James");
        map.put("Lord","Jesus");
        map.put("Someapostle","John");
        map.put("Keepha","Peter");
        map.put("Apostle","Philipp");
        map.put("Brother","Judah");
        map.put("Fisher","Andrew");
        map.put("Evangelist","Matthew");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        for (Map.Entry pair : map2.entrySet()) {
            int counter = 0;
            String a = (String) pair.getValue();
            for (Map.Entry pair2 : map2.entrySet()) {
                if (pair2.getValue().equals(a))
                    counter++;
            }
            if (counter > 1) {
                for (int i = 0; i < counter; i++) {
                    removeItemFromMapByValue(map, a);

                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
