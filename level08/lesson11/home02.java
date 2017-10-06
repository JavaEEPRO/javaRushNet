package com.javarush.test.level08.lesson11.home02;

//Most certainly I tell you, that you will weep and lament, but the world will rejoice. 
//You will be sorrowful, but your sorrow will be turned into joy.(John 16:20)

import java.util.HashSet;
import java.util.Set;

/* Set of all animals
1. Create public static classes Cat and Dog within the class Solution.
    2. Implement the method createCats(), which should return a set of 4 cats.
    3. Implement the method createDogs(), which should return a set of 3 dogs.
    4. Implement the method join(), which should return the combined set of all animals, both cats and dogs.
    5. Implement the method removeCats(), which should remove from the set pets all the cats present
    in the set cats.
    6. Implement the method printPets(), which should display to the screen all the animals present in it. Each animal should be on a new line.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        Cat a = new Cat();
        Cat b = new Cat();
        Cat c = new Cat();
        Cat d = new Cat();

        result.add(a);//add your code here
        result.add(b);
        result.add(c);
        result.add(d);
        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> dogs= new HashSet<Dog>();//add your code here
        Dog e = new Dog();
        Dog f = new Dog();
        Dog g = new Dog();

        dogs.add(e);
        dogs.add(f);
        dogs.add(g);
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> pets = new HashSet<Object>();//add your code here

        for (Cat cat : cats){
            pets.add(cat);
        }
        for (Dog dog: dogs) {
            pets.add(dog);
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
       pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object pet : pets){//add your code here
            System.out.println(pet);
        }
    }

    public static class Dog{}//add your code here
    public static class Cat{}
}
