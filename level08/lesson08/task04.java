package com.javarush.test.level08.lesson08.task04;

//Pilate therefore went out to them, and said, "What accusation do you bring against this man?"(John 18:29)

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* Remove all the people born in the summer
Create a dictionary (Map<String, Date>) and add ten entries according to the model «last mane» - «birth date».
    Remove from the map all the people born in the summer.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Seemon", new Date("JULY 10 1981"));
        map.put("Peeter", new Date("AUGUST 9 1982"));//add your code here
        map.put("Andrew", new Date("SEPTEMBER 8 1983"));
        map.put("Didymus", new Date("NOVEMBER 7 1984"));
        map.put("Paul", new Date("DECEMBER 6 1985"));
        map.put("John", new Date("JANUARY 5 1986"));
        map.put("James", new Date("FEBRUARY 4 1987"));
        map.put("Jacob", new Date("MARCH 3 1988"));
        map.put("Jesus", new Date("APRIL 2 1989"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();//add your code here

        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth()>=5 && pair.getValue().getMonth()<=7){iterator.remove();}
        }
    }
}
