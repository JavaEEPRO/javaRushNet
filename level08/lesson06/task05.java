package com.javarush.test.level08.lesson06.task05;

//One of the servants of the high priest, being a relative of him whose ear Peter had cut off,
//said, "Didn't I see you in the garden with him?" (John 18:26)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Four methods
Implement 4 methods. The methods should return a list best suited to perform specified operations (to cope fast with a large number of operations). No measurement needed.
*/

public class Solution
{
    public static List  getListForGet()
    {
        ArrayList<String> list = new ArrayList<String>(); //add your code here
        return list;
    }

    public static List  getListForSet()
    {
       ArrayList<String> list = new ArrayList<String>(); //add your code here
       return list;
    }

    public static List  getListForAddOrInsert()
    {
        LinkedList<String> list = new LinkedList<String>(); //add your code here
        return list;
    }

    public static List  getListForRemove()
    {
        LinkedList<String> list = new LinkedList<String>(); //add your code here
        return list;
    }
}
