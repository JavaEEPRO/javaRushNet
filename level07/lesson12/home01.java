package com.javarush.test.level07.lesson12.home01;

//Simon Peter followed Jesus, as did another disciple. Now that disciple was known to the high priest, 
//and entered in with Jesus into the court of the high priest(John 18:15)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Display numbers in reverse order
Read from the keyboard 10 numbers and fill the list with them.
    Display to the screen the numbers in reverse order. Use the loop.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>(10);//add your code here
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }        

        for (int i = 9; i > -1; i--) {
            System.out.println(list.get(i));
        }
    }
}
