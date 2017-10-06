package com.javarush.test.level08.lesson11.home01;

//They answered him, "If this man weren't an evildoer, we wouldn't have delivered him up to you."(John 18:30)

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* Set of cats
1. Create a public static class Cat within the class Solution.
    2. Implement the method createCats(), which should create a Set of cats and add three cats to it.
    3. In the main method, remove a cat from the Set cats.
    4. Implement the method printCats(), which should display to the screen all the cats that remain in the set. Every cat should be on a new line.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        for(Cat cat : cats)
        {
            cats.remove(cat);//add your code here. step 3
            break;
        }
        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> cats = new HashSet<Cat>();//add your code here. step 2
        Cat e = new Cat();
        Cat f = new Cat();
        Cat g = new Cat();
        cats.add(e);
        cats.add(f);
        cats.add(g);
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        Iterator<Cat> iterator = cats.iterator();// step 4
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static class Cat{// step 1

    }
}
