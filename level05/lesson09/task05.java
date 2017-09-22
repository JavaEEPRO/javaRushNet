package com.javarush.test.level05.lesson09.task05;

//Not for these only do I pray, but for those also who believe in me through their word (John 17:20)

/* Create a class Rectangle
Create a class Rectangle. Its data will be top, left, width and height. Create for it as much constructors as possible:
    Examples:
    -	4 parameters are set: left, top, width, height
    -	width/height are not set (both equal 0)
    -	height are not set (equal to width), create a square
    -	create a copy of another rectangle (it’s passed in the parameters)
*/

public class Rectangle
{
    private int left, top, width, height;//add your code here
    
    public Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }
    
    public Rectangle(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    
    public Rectangle(Rectangle anotherRectangle){
        this.left = anotherRectangle.left;
        this.top = anotherRectangle.top;
        this.width = anotherRectangle.width;
        this.height = anotherRectangle.height;
    }
    public static void main(String[] args){}

}
