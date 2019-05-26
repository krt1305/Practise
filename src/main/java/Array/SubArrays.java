package Array;

public class SubArrays {


    //https://www.geeksforgeeks.org/subarraysubstring-vs-subsequence-and-programs-to-generate-them/
    public static void main(String[] args) {
            int arr[]={1,2,3,4};


            //pick starting point
        for (int i=0; i <arr.length; i++)
        {
            // Pick ending point
            for (int j=i; j<arr.length  ; j++)
            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++)
                    System.out.print(arr[k]+" ");
                System.out.println();
            }
        }
        //In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/subsrings.
    }
}
