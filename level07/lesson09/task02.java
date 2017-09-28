package com.javarush.test.level07.lesson09.task02;

//And led him away to Annas first; for he was father in law to Caiaphas, which was the high priest that same year (John 18:13)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 words in reverse order
Read from the keyboard 5 words. Add them into a string list and display them to the screen in reverse order.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       ArrayList<String> list = new ArrayList<String> (5); //add your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       for (int i = 0; i < 5; i++) {
           list.add(br.readLine());
       }
       for (int i = list.size()-1; i > -1; i--) {
           System.out.println(list.get(i));
       }
    }
}
