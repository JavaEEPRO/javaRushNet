package com.javarush.test.level05.lesson09.task03;

//For their sakes I sanctify myself, that they themselves also may be sanctified in truth. (John 17:19)

/* Create a class Dog
Create a class Dog with three constructors:
    - Name
    - Name, height
    - Name, height, color
*/

public class Dog
{
    private String name, color;//add your code here
    private int height;
    public Dog(String name){
        this.name = name;
    }
    public Dog(String name, int height){
        this.name = name;
        this.height = height;
    }
    public Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args){}

}
