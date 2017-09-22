package com.javarush.test.level05.lesson09.task01;

//He who hates me, hates my Father also. (John 15:23)

/* Create a class Friend
Create a class Friend with three constructors:
    - Name
    - Name, age
    - Name, age, sex
*/

public class Friend
{
    String name;//add your code here
    int age;
    char sex;
    public Friend(String name){
        this.name = name;
    }
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public static void main(String[] args){}
}
