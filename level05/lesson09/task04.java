package com.javarush.test.level05.lesson09.task04;

//If I hadn't done among them the works which no one else did, they wouldn't have had sin. 
//But now have they seen and also hated both me and my Father.(John 15:24)

/* Create a class Circle
Create a class Circle with three constructors:
    - centerX, centerY, radius
    - centerX, centerY, radius, width
    - centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centerX, centerY, radius, width;//add your code here
    private String color;
    
    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    
    public Circle(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    
    public Circle(int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
    public static void main(String[] args){}

}
