
//A woman, when she gives birth, has sorrow, because her time has come. But when she has delivered the child,
//she doesn't remember the anguish any more, for the joy that a human being is born into the world.(John 16:21)

package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* People with the same first names and/or last names
1. Create a dictionary (<String, String>) and add 10 persons according to the model «last name» - «first name».
    2. Among these 10 persons, let there be people with the same first names.
    3. Among these 10 persons, let there be people with the same last names.
    4. Display to the screen contents of the Map.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        HashMap<String, String> map = new HashMap<String, String>();//add your code here
        map.put("Jesus","Savior");
        map.put("John","Baptist");
        map.put("John","Evangelist");
        map.put("James","Elder");
        map.put("Pavel","Apostle");

        map.put("Peter","Keepha");
        map.put("James","Zebedee");
        map.put("Jacob","Zebedee");
        map.put("Matthew","Collector");
        map.put("Luke","Doctor");

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
