package com.javarush.test.level06.lesson11.home01;

//Jesus therefore, knowing all the things that were happening to him, went forth,
//and said to them, "Who are you looking for?" (John 18:4)

/* Class Cat and static variable catCount
Write a static variable public int catCount in the class Cat. Create a constructor [public Cat()].
    Let the static variable catCount increase by 1 every time you create a cat (a new object Cat).
    Create 10 objects Cat and display the value of the variable catCount.
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++){//C????? 10 ???????? Cat ???
            Cat cat = new Cat();
        }

        System.out.println(Cat.catCount);//?????? ?? ????? catCount ???
    }

    public static class Cat
    {
        public static int catCount;//C????? ??????????? ?????????? ???

        public Cat(){//?????? ??????????? ???
            Cat.catCount++;
        }
    }

}
