package com.javarush.test.level06.lesson05.task02;

//You will also testify, because you have been with me from the beginning (John 15:27)

/* Classes Cat and Dog and finalize() method for each class
In each Cat and Dog class write a finalize() method, which displays to the screen a message that the object is destroyed.
*/

public class Cat
{
    protected void finalize(){//add your code here
    System.out.println("object is recreated)))");
    }
}

class Dog
{
    protected void finalize(){//add your code here
    System.out.println("object is recreated");
    }
}
