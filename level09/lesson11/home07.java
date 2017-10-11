package com.javarush.test.level09.lesson11.home07;

//This is eternal life, that they should know you, the only true God, and him whom you sent, Jesus Christ. (John 17:3)

/* Move static modifies
Move static modifiers so the code compiles.
*/

public class Solution
{
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public void main(String[] args)           \\if we set this void as static to, program compiles, but won't pass validation)))
    {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA()
    {
        return A;
    }

}
