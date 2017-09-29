package com.javarush.test.level07.lesson12.home04;

//A little while, and you will not see me. Again a little while, and you will see me." (John 16:16)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Read strings from the keyboard until user enters the string “end”
Create a list of strings.
    Read from the keyboard strings (whatever you want), add them to the list.
    Read strings from the keyboard until user enters the string “end”. “end” should be omitted.
    Display to the screen the strings. Each string should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();//add your code here
        boolean theEnd = false;
        int counter = 0;
        while(!theEnd){
            list.add(counter,reader.readLine());
            if (list.get(counter).equals("end")){theEnd = true;}
            counter++;
        }
        list.remove(list.size()-1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
