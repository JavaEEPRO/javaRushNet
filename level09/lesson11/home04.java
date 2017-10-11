package com.javarush.test.level09.lesson11.home04;

//THEN therefore, Pilate took Jesus, and scourged him. (John 19:1)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Date converter
Read from the keyboard a date in the format «08/18/2013»
    Display to the screen that date in the form of «AUG 18, 2013».
    Use the objects Date and SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //add your code here
        String date = reader.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat();
        try
        {
            sdf.applyPattern("MM/dd/yyyy");
            Date result = sdf.parse(date);

            sdf = new SimpleDateFormat("MMM dd, yyyy", Locale.UK);
            System.out.println(sdf.format(result).toUpperCase());
        }catch(Exception e) {}
    }
}
