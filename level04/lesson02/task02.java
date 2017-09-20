package com.javarush.test.level04.lesson02.task02;

//And this is life eternal, that they might know thee the only true God, and Jesus Christ, whom thou hast sent. (John 17:3)

/* Implement method addNewCat()
Implement the addNewCat method, so that when it’s called (that is, when a new cat is added) the number of cats increases by 1. The catsCount variable is responsible for the number of cats.
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
       Cat.catsCount++; //add your code here
    }
}
