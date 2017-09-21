package com.javarush.test.level05.lesson05.task03;

//I have given them thy word; and the world hath hated them, because they are not of the world,
//even as I am not of the world. (John 17:14)


/* Getters and setters for the class Dog
Create a class Dog. A dog must have a name - String name and age - int age.
    Create getters and setters for all the variables of the Dog class.
*/

public class Dog {
    //add class variables here
    String name;
    int age;
    //add getters & setters here
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    public static void main(String[] args){}
}
