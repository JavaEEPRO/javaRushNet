package com.javarush.test.level09.lesson11.home05;

//As thou hast given him power over all flesh, that he should give eternal life to as many as thou hast given him (John 17:2)

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Vowels and consonants
Write a program that reads line from the keyboard.
    The program should display to the screen two strings:
    1) the first string should contain vowels
    2) the second string should contain consonants and punctuation characters from the entered text.
    Separate characters by spaces.

    Example input:
    Stop look listen.
    Example output:
    o o o i e
    s t p l k l s t n .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String vow = "";
        String cons = "";
        String string = reader.readLine();
        char[] array = string.toCharArray();


        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i])) {
                if (i == 0){vow += array[i];}else{vow +=(" " + array[i]);}}
            else {if (array[i] != ' ') {
                if (i == 0) {cons += array[i];}else{cons +=(" " + array[i]);}}}
        }
        System.out.println(vow);
        System.out.println(cons);
    }


    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

    //Method checks whether the letter is a vowel
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //transform character to lowercase

        for (char d : vowels)   //Looking among the array of vowels
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
