package com.javarush.test.level09.lesson06.task05;

//Pilate said to him, "What is truth?" When he had said this, he went out again to the Jews, and said to them, 
//"I find no basis for a charge against him.(John 18:38)

import java.util.HashMap;

/* Exception when operating with Map collections
Catch the exception that occurs when run the code:
    HashMap<String, String> map = new HashMap<String, String>(null);
    map.put(null, null);
    map.remove(null);
    Display the exception to the screen, specifying its type.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try{//add your code here

        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);

        }catch (NullPointerException e) { System.out.println(e);}//add your code here

    }
}
