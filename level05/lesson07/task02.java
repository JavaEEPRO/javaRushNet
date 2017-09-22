package com.javarush.test.level05.lesson07.task02;

//They are not of the world even as I am not of the world. (John 17:16)

/* Create a class Cat
Create a class Cat with five initializers:
    - Name
    - Name, weight, age
    - Name, age (standard weight)
    - Weight, color, (name, address and age are unknown, it’s an alley cat)
    - Weight, color, address (it’s someone’s house cat)
    Initializer’s task is to make an object valid. For example, if the weight is unknown, you need to specify some average weight. A cat can’t have any weight at all, likewise age. But it can have no name (null). The same applies to the address - can be null.
*/

public class Cat
{
    private String name, address, color;//add your code here
    private int age, weight;
    public void initialize(String name){
        this.name = name;
        this.weight = 1;
        this.age = 1;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.weight = 1;
        this.age = age;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.age = 1;
        this.address = address;
    }
    public static void main(String[] args){}
}
