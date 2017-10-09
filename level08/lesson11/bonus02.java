package com.javarush.test.level08.lesson11.bonus02;

//Until now, you have asked nothing in my name. Ask, and you will receive, that your joy may be made full. (John 16:24)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Add new functionality to the program.
Task: The program determines which family (its last name) lives in a house with the specified number.
    New task: The program should work with the cities and not with house numbers.

    Example input:
    Washington
    the Smiths
    New York
    the Browns
    London
    the Johnsons

    London

    Example output:
    the Johnsons
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> cities = new ArrayList<String>();
        ArrayList<String> lastNames = new ArrayList<String>();
        while (true)
        {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            cities.add(city);
            String lastName = reader.readLine();
            if (lastName.isEmpty()) break;
            lastNames.add(lastName);
        }

        //read home number
        String targetCity = reader.readLine();

        if (targetCity != null && cities.contains(targetCity))
        {
            for (int i = 0; i < cities.size(); i++) {
                if (cities.get(i).equals(targetCity)) {System.out.println(lastNames.get(i));}
            }
        }
    }
}
