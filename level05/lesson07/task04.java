package com.javarush.test.level05.lesson07.task04;

//If I had not come and spoken to them, they would not have had sin; but now they have no excuse for their sin.(John 15:22)

/* Create a class Circle
Create a class Circle with three initializers:
    - centerX, centerY, radius
    - centerX, centerY, radius, width
    - centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centerX, centerY, radius, width;//add your code here
    private String color;
    
    public void initialize(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public void initialize(int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
    public static void main(String[] args){}
}
