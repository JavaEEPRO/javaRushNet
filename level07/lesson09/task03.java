package com.javarush.test.level07.lesson09.task03;

//However when he, the Spirit of truth, has come, he will guide you into all truth, for he will not speak from himself; 
//but whatever he hears, he will speak. He will declare to you things that are coming.(John 16:13)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* The word «here»
1. Create a list of the words «stop», «look», «listen».
    2. Add a string containing «here» after each word.
    3. Display the result. Each element of list should be on a new line. Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       ArrayList<String> list = new ArrayList<String>(); //add your code here
       list.add("stop");
       list.add("look");
       list.add("listen");
       
       for (int i = 1; i < 6; i+=2){
       list.add(i,"here");
       }
       
       for (int i = 0; i < 6; i++) {
           System.out.println(list.get(i));
       }
    }
}
