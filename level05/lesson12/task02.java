package com.javarush.test.level05.lesson12.home02;

//that they may all be one; even as you, Father, are in me, and I in you, that they also may be one in us; 
//that the world may believe that you sent me. (John 17:21)

/* A Man and A Woman
1. Create public static classes Man and Woman within the class Solution.
    2. Classes must have fields: name(String), age(int), address(String).
    3. Create constructors to pass all the possible parameters to.
    4. Use the constructor to create two objects of each class with all the data.
    5. Display the objects in format [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man me = new Man("servant", 34, "feetOfJesus");//create two object of every class here
        Woman wife = new Woman("Larisa",35,"feetOfJesus");
        System.out.println(me.name + " " + me.age + " " + me.address);//output them to screen here
        System.out.println(wife.name + " " + wife.age + " " + wife.address);
    }

    public static class Man{//add your classes here
        String name, address;
        int age;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name, address;
        int age;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
