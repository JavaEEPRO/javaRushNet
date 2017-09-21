package com.javarush.test.level05.lesson05.task05;

//I pray not that you would take them from the world, but that you would keep them from the evil one.(John 17:15)

/* Hold three twosome fights between cats
Create three cats using the class Cat.
    Hold three pairwise fights between cats.
    Do not create the class Cat. For the fight, use the method boolean fight(Cat anotherCat).
    Display the result of each fight.
*/

public class Solution {
    public static void main(String[] args) {
        Cat druzhok = new Cat("Druzhok",1,1,3);//add your code here
        Cat koreshok = new Cat("Koreshok",1,2,5);
        Cat cimbor = new Cat("Cimbor",1,1,7); 
        
        System.out.println(druzhok.fight(cimbor));
        System.out.println(druzhok.fight(koreshok));
        System.out.println(koreshok.fight(cimbor));
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
