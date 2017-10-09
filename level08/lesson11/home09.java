package com.javarush.test.level08.lesson11.home09;

//Then Pilate entered into the judgment hall again, and called Jesus, and said unto him, Art thou the King of the Jews? (John 18:33)

import java.util.Date;

/* Working with date
1. Implement the method isDateOdd(String date) so that it returns true, if the number of days from the
beginning of the year is odd, otherwise it returns false.
    2. String date is passed in the format MAY 1 2013

    JANUARY 1 2000 = true
    JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date current = new Date(date);
        Date beginning = new Date(current.getYear(), 0, 0);
        Date difference = new Date(current.getTime() - beginning.getTime());
        if ((difference.getTime() / 1000) / (86400) % 2 == 0) { return false; } else { return true; }
    }
}
