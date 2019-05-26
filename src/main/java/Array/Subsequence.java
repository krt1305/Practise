package Array;

import java.math.BigInteger;

public class Subsequence {

    //https://www.geeksforgeeks.org/subarraysubstring-vs-subsequence-and-programs-to-generate-them/
    //More generally, we can say that for a sequence of size n, we can have (2n-1) non-empty sub-sequences in total.

    static int arr[] = new int[]{1, 2, 3, 4};
    public static void main(String[] args) {
        System.out.println("All Non-empty Subsequences");
        printSubsequences(arr.length);
    }



    static void printSubsequences(int n)
    {
        /* Number of subsequences is (2**n -1)*/
        int opsize = (int)Math.pow(2, n);

        /* Run from counter 000..1 to 111..1*/
        for (int counter = 1; counter < opsize; counter++)
        {
            for (int j = 0; j < n; j++)
            {
                /* Check if jth bit in the counter is set
                    If set then print jth element from arr[] */

                if (BigInteger.valueOf(counter).testBit(j))
                    System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
