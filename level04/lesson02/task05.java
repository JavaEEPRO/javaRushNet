package com.javarush.test.level04.lesson02.task05;

//If a man abide not in me, he is cast forth as a branch, and is withered;
//and men gather them, and cast them into the fire, and they are burned. (John 15:6)

/* Count the number of cats
Write a code that counts the number of cats created (count) and then displays it on the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat.count++;//add your code here

        Cat cat2 = new Cat();
        Cat.count++;//add your code here

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}
