package com.javarush.test.level08.lesson11.bonus01;

//Until now, you have asked nothing in my name. Ask, and you will receive, that your joy may be made full. (John 16:24)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Month number
The program should read from the keyboard the name of the month and display to the screen its
 number in following way: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String month = reader.readLine();
        int index = 0;
        //ArrayList<String> list = new ArrayList<String>();
        if (month.equals("January")) {index = 1;}
        else if (month.equals("February")) {index = 2;}
        else if (month.equals("March")) {index = 3;}
        else if (month.equals("April")) {index = 4;}
        else if (month.equals("May")) {index = 5;}
        else if (month.equals("June")) {index = 6;}
        else if (month.equals("July")) {index = 7;}
        else if (month.equals("August")) {index = 8;}
        else if (month.equals("September")) {index = 9;}
        else if (month.equals("October")) {index = 10;}
        else if (month.equals("November")) {index = 11;}
        else if (month.equals("December")) {index = 12;}

        System.out.println(month + " is " + index + " month");
    }

}
