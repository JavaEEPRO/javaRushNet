package com.javarush.test.level05.lesson09.task02;

//As you sent me into the world, even so I have sent them into the world. (John 17:18)

/* Create a class Cat
Create a class Cat with five constructors:
    - Name,
    - Name, weight, age
    - Name, age (standard weight)
    - Weight, color, (name, address and age unknown. It’s an alley cat)
    - Weight, color, address (it’s someone’s house cat)
    Initializer’s task is to make an object valid. For example, if the weight is unknown, you need to specify some average weight. A cat can’t have any weight at all, likewise age. But it can have no name (null). The same applies to the address - can be null.
*/

public class Cat
{
    private String name, color, address;//add your code here
    private int weight, age;
    
    public Cat(String name){
        this.name = name;
    }
    
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 1;
    }
    
    public Cat(int weight, String color){
        this.weight = weight;
        this.age = 1;
        this.color = color;
    }
    
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.age = 1;
        this.color = color;
        this.address = address;
    }
    
    public static void main(String[] args){}
}
