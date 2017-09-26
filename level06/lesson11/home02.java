package com.javarush.test.level06.lesson11.home02;

//But now I am going to him who sent me, and none of you asks me, 'Where are you going?' (John 16:5)

import java.util.ArrayList;

/* Static cats
1. Add a public static variable cats (ArrayList<Cat>) in the class Cat.
    2. Every time you create a cat (a new object Cat), let this new cat be added to the variable cats.
    Create 10 objects Cat.
    3. The method printCats() should display all the cats. You need to use the variable cats  in the method.

    Tip:
    To create cats variable use code line:
    public static ArrayList<Cat> cats = new ArrayList<Cat>();
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();
    public Cat() {
    }
    //add your code here

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){//Create 10 Cats here
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++){//Add your code for step 3 code here
            System.out.println(cats.get(i));
        }
    }
}
