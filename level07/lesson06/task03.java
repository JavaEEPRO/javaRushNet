package com.javarush.test.level07.lesson06.task03;

//Jesus therefore said to Peter, "Put the sword into its sheath. 
//The cup which the Father has given me, shall I not surely drink it?"(John 18:11)

import java.util.ArrayList;
//import java.util.Collections;
import java.io.*;
/* 5 lines in reverse order
1. Create a list of strings.
    2. Read 5 strings from keyboard, then add them to the list.
    3. Arrange them in reverse order.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //add your code here
        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }
        //Collections.sort(list, Collections.reverseOrder());
        for (int i = 4; i > -1; i--) {
            System.out.println(list.get(i));
        }
    }
}




