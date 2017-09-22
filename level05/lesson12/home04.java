package com.javarush.test.level05.lesson12.home04;

//The glory which you have given me, I have given to them; that they may be one, even as we are one (John 17:22)

/* Display the current date
Display to the screen the current date in a form similar to «21 02 2014».
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        //Date date = new Date();//add your code here
        //SimpleDateFormat sdf = new SimpleDateFormat("dd mm yyyy");
        //System.out.println(sdf.format(date));

        long currentTime = System.currentTimeMillis();
        String currentStringDate = new SimpleDateFormat("dd MM yyyy").format(currentTime);
        System.out.print(currentStringDate);
    }
}
