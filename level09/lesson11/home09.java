package com.javarush.test.level09.lesson11.home09;

//They kept saying, "Hail, King of the Jews!" and they kept slapping him. (John 19:3)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

/* Ten cats
Create a class Cat with a field String name.
    Create a dictionary Map<String, Cat>, add 10 cats on the model «Name» - «Cat».
    Get from the Map a Set of names and display the set to the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        Cat c1 = new Cat("drujok");
        Cat c2 = new Cat("cimbore");
        Cat c3 = new Cat("koreshok");
        Cat c4 = new Cat("drujok2");
        Cat c5 = new Cat("cimboro");
        Cat c6 = new Cat("cimbora");
        Cat c7 = new Cat("koreshak");
        Cat c8 = new Cat("koshak");
        Cat c9 = new Cat("young");
        Cat c0 = new Cat("friend");

        map.put(c1.name, c1);
        map.put(c2.name, c2);
        map.put(c3.name, c3);
        map.put(c4.name, c4);
        map.put(c5.name, c5);
        map.put(c6.name, c6);
        map.put(c7.name, c7);
        map.put(c8.name, c8);
        map.put(c9.name, c9);
        map.put(c0.name, c0);
        return map;//add your code here
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        HashSet<Cat> set = new HashSet<Cat>();//add your code here
            Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String, Cat> pair = iterator.next();
                set.add(pair.getValue());
            }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
