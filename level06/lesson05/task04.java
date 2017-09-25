package com.javarush.test.level06.lesson05.task04;

//When Jesus had spoken these words, he went out with his disciples over the brook Kidron, 
//where there was a garden, into which he and his disciples entered. (John 18:1)

/* Cat counter
In Cat class constructor [public Cat()], increase the cat counter (static variable catCount of the same class) by 1. In the method finalize() decrease by 1.
*/

public class Cat
{
    public static int catCount = 0;

    public Cat(){//add your code here
        this.catCount++;
    }
    
    protected void finalize(){
        this.catCount--;
    }

    public static void main(String[] args) {
    }
}
