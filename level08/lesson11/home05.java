package com.javarush.test.level08.lesson11.home05;

//Therefore you now have sorrow, but I will see you again, and your heart will rejoice, 
//and no one will take your joy away from you. (John 16:22)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Stop Look Listen. Now capitalized
Write a program that should read from the keyboard a string.
    The program should replace the first letters of all words in the text with the uppercase.
    Display to the screen the result.

    Example input:
    stop look listen
    Example output:
    Stop Look Listen
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        StringBuilder s = new StringBuilder(reader.readLine());//add your code here
        int pos=0;
        int l=s.length();
        loop: while (pos < l){
            while (s.charAt(pos) == ' ') if (++pos==l) break loop;
            s.setCharAt(pos,Character.toUpperCase(s.charAt(pos)));
            while (s.charAt(pos) != ' ') if (++pos==l) break loop; }
            System.out.println(s);


    }
}
