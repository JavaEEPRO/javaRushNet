package com.javarush.test.level05.lesson05.task02;

//And now come I to thee; and these things I speak in the world, that they might have my joy fulfilled in themselves. (John 17:13)

/* Implement method fight
Implement method boolean fight(Cat anotherCat): implement a fight mechanism depending on cats’ weight, age and strength. Make up a dependency by yourself. The method should determine, whether current cat (the object whose fight method was called) or anotherCat won fight, i.e. return true if current cat won and false, if it didn’t win. The following condition must be met:
    if cat1.fight(cat2) = true, then cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        if (this.age*this.weight*this.strength > anotherCat.age*anotherCat.weight*anotherCat.strength) {return true;}//add your code here
        else return false;

    }
    public static void main(String[] args){}
}
