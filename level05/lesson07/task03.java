package com.javarush.test.level05.lesson07.task03;

//But all these things will they do to you for my name's sake, because they don't know him who sent me. (John 15:21)

/* Create a class Dog
Create a class Dog with three initializers:
    - Name
    - Name, height
    - Name, height, color
*/

public class Dog
{
    private String name, color;//add your code here
    private int height;
    
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args){}
}
