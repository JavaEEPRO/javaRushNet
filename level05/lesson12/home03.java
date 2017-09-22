package com.javarush.test.level05.lesson12.home03;

//But when the Comforter is come, whom I will send unto you from the Father, 
//even the Spirit of truth, which proceedeth from the Father, he shall testify of me (John 15:26)

/* Create public static classes Dog and Cat
Add three fields to each class at your option.
    Create objects for the Tom and Jerry cartoon characters, as much as you remember.
    Example:
    Mouse jerryMouse = new Mouse(“Jerry”, 12 (height, cm), 5 (tail length, cm))
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        Mouse anotherMouse = new Mouse("Ratio", 13, 6);//add your code here
        Mouse littleMice = new Mouse("Funny", 8, 4);
        Mouse mainMouse = new Mouse("General", 14, 9);

        Dog someDoggy = new Dog("Chockie", 30, 2);
        Dog anotherPuppy = new Dog("Smogie", 25, 10);

        Cat tommyCat = new Cat("Thomas", 23, 10);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog{//add your classes here
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail){
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat{
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail){
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

}
