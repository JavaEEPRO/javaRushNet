package com.javarush.test.level05.lesson12.home05;

//I in them, and you in me, that they may be perfected into one; 
//that the world may know that you sent me, and loved them, even as you loved me.(John 17:23)

import java.io.*;
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int sum = 0;
        int number;
        String str;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            str = reader.readLine();
            if (str.equals("total")) break; //this program passed validation only when was replaced "total" by "сумма" :)))
            number = Integer.parseInt(str);
            sum += number;
        }
        System.out.println(sum);
    }
}
