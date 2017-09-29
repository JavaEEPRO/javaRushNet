package com.javarush.test.level07.lesson12.home02;

//All things whatever the Father has are mine; therefore I said that he takes of mine, and will declare it to you. (John 16:15)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Move first M lines to the end of the list
Read from the keyboard 2 numbers: N and M.
    Read from keyboard N strings and fill a list with them.
    Move first M lines to the end of the list
    Display to the screen the list. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());//add your code here
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            list.add(list.get(i));
        }
        for (int i = 0; i < m; i++) {
            list.remove(0);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}
