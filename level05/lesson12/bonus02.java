package com.javarush.test.level05.lesson12.bonus02;

//Father, I desire that they also whom you have given me be with me where I am, that they may see my glory,
//which you have given me,for you loved me before the foundation of the world(John 17:24)

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Add new functionality to the program
Old Task: add a new function that reads from keyboard two numbers and displays their minimum.
    New task: add a new function that reads from keyboard five numbers and displays their minimum.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e)
    {

        if (a<b && a<c && a<d && a<e){return a;}
        else if (b<a && b<c && b<d && b<e){return b;}
        else if (c<a && c<b && c<d && c<e){return c;}
        else if (d<a && d<b && d<c && d<e){return d;}
        else return e;

    }

}
