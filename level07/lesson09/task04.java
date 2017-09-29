package com.javarush.test.level07.lesson09.task04;

//Now it was Caiaphas who advised the Jews that it was expedient that one man should perish for the people. (John 18:14)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Letters «r» and «l»
1. Create a list of words/strings, fill it with whatever you want.
    2. The method fix() should:
    2.1. delete all the words containing letter «r» from the list of strings
    2.2. double all the words containing letter «l».
    2.3. leave the word unchanged if it contains both letters «r» and «l».
    2.4. don’t do anything with other words.

    Example:
    rose
    willow
    lyre
    oak

    Output data:
    willow
    willow
    lyre
    oak
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); //0
        list.add("lyre"); //1
        list.add("willow"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++) {//add your code here
        if (list.get(i).contains("l") && !(list.get(i).contains("r"))){list.add(i,list.get(i));i++;}
        else if (list.get(i).contains("r") && !(list.get(i).contains("l"))) {list.remove(i);i--;}
        }
        return list;
    }
}
