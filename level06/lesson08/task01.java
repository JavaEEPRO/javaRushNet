package com.javarush.test.level06.lesson08.task01;

//They will put you out of the synagogues. 
//Yes, the time comes that whoever kills you will think that he offers service to God. (John 16:2) 

/* Class Cat and static variable catCount
Write a static variable int catCount in the class Cat. Create a constructor [public Cat()], in which the given variable should be increased by 1.
*/

public class Cat
{
    public static int catCount;//add your code here
    
    public Cat(){
        Cat.catCount++;
    }

}

