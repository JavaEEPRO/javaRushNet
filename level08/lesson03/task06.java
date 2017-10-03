package com.javarush.test.level08.lesson03.task06;

//Jesus answered him, "If I have spoken evil, testify of the evil; but if well, why do you beat me?" (John 18:23)

import java.util.HashMap;
import java.util.Map;

/* HashMap collection of Object
There is a collection HashMap<String, Object>, it already has 10 different object pairs.
    Display to the screen the contents of the collection. Each entry should be on a new line.

    Output example (only one string is shown):
    Sim - 5
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double)123);

        for (Map.Entry<String, Object> pair : map.entrySet()){//add your code here
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
