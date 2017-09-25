package com.javarush.test.level05.lesson12.bonus01;

//But when the Comforter is come, whom I will send unto you from the Father, even the 
//Spirit of truth, which proceedeth from the Father, he shall testify of me (John 15:26)

import java.io.*;

/* Program doesn’t compile and run. Fix it.
Task: The program should read from keyboard two numbers and display their total.
*/

public class Solution
{
   public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
