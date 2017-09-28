import java.io.BufferedReader;
import java.io.InputStreamReader;

//that the word might be fulfilled which he spoke, "Of those whom you have given me, I have lost none."(John 18:9)

/* One large and two small arrays
1. Create an array of 20 numbers.
    2. Read from keyboard 20 numbers and fill the array with them.
    3. Create two arrays of 10 numbers each.
    4. Copy numbers of the large array to two small arrays: the half of the numbers to the first array, the other half to the second one.
    5. Display to the screen the second small array. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] largeArray = new int[20];//add your code here
        int[] firstSmallArray = new int[10];
        int[] secondSmallArray = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            largeArray[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10; i++) {
            firstSmallArray[i] = largeArray[i];
            secondSmallArray[i] = largeArray[i+10];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(secondSmallArray[i]);
        }
    }
}
