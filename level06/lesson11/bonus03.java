package com.javarush.test.level06.lesson11.bonus03;

He shall see of the travail of his soul, [and] shall be satisfied: 
//by his knowledge shall my righteous servant justify many; for he shall bear their iniquities.(Isaijah 53:11)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Learning and practicing algorithms.
Task: Write a program that reads from keyboard 5 numbers and displays them in ascending order.
    Example input:
    3
    2
    15
    6
    17
    Example output:
    2
    3
    6
    15
*/

public class Solution
{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>(4);
        for (int i = 0; i < 5; i++) {
            list.add(i,Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
