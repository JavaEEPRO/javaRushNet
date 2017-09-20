package com.javarush.test.level04.lesson02.task03;

//I have glorified thee on the earth: I have finished the work which thou gavest me to do. (Jonh 17:4)

/* Implement method setCatsCount()
Implement the setCatsCount method, so the value of the catsCount variable would be equal to the passed parameter.
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
      Cat.catsCount = catsCount; //add your code here
    }
}
