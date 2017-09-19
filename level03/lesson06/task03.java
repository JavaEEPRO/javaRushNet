package com.javarush.test.level03.lesson06.task03;

//Every branch in me that beareth not fruit he taketh away: and every branch 
//that beareth fruit, he purgeth it, that it may bring forth more fruit. (John 15:2)

/* Seven colors of the rainbow
Write a program that displays seven colors of the rainbow.
    Two lines must have three colors. The third one must have just one color.
    Separate the colors in the lines by spaces.
*/

public class Solution
{
    public static void main(String[] args)
    {   Red red= new Red();

Orange orange= new Orange();

Yellow yellow= new Yellow();

Green green= new Green();

Blue blue= new Blue();

Indigo indigo= new Indigo();

Violet violet= new Violet(); 

    }

    public static class Red
    {
        public Red() {
            System.out.print("Red ");
        }
    }

    public static class Orange
    {
        public Orange() {
            System.out.print("Orange ");
        }
    }

    public static class Yellow
    {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green
    {
        public Green() {
            System.out.print("Green ");
        }
    }

    public static class Blue
    {
        public Blue() {
            System.out.print("Blue ");
        }
    }

    public static class Indigo
    {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet
    {
        public Violet() {
            System.out.print("Violet");
        }
    }
}
