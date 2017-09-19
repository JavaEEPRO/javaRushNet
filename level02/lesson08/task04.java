package com.javarush.test.level02.lesson08.task04;

//Вы слышали, что Я сказал вам: иду от вас и приду к вам. Если бы вы любили Меня, то возрадовались бы, что Я сказал: иду к Отцу; ибо Отец Мой более Меня. (John 14:28)
//You heard how I told you, 'I go away, and I come to you.' If you loved me, you would have rejoiced, because I said 'I am going to my Father;' for the Father is greater than I.

/* Minimum of four numbers
Write a function that returns a minimum of four numbers.
    The function min(a,b,c,d) has to use (call) the function min(a, b)
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {if (min(a,b)<min(c,d)){return min(a,b);}
    else return min(c,d);    //add your code here
    }
    public static int min(int a, int b)
    {if (a<b){//add your code here
        return a;}else{
    return b;}
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}
