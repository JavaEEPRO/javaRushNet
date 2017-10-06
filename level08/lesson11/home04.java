package com.javarush.test.level08.lesson11.home04;

//Pilate therefore said to them, "Take him yourselves, and judge him according to your law." 
//Therefore the Jews said to him, "It is not lawful for us to put anyone to death," (John 18:31)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* The minimum of N numbers
1. Read from the keyboard number N.
    2. Read from the keyboard N integers and fill a list with them using a method getIntegerList().
    3. Find the minimum number among the elements of the list using a method getMinimum().
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);// Find minimum here
        for (int i = 0; i <array.size(); i++) {
            if (array.get(i) < min) {min = array.get(i);}
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        ArrayList<Integer> array = new ArrayList<Integer>();//Create and initialize a list here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }
        return array;
    }
}
