package Array;

public class frequencyInSortedArray {

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,3};
        int requiredNum=3,count=0;
        int mid;
        int low=0,high=arr.length-1;

       while(low<=high)
        {
            mid=(low+high)/2;
            if(requiredNum==arr[mid])
            {
                low=mid+1;
               // findOccur(arr,low,high,requiredNum);
                count++;


            }

            else if(requiredNum>arr[mid])
            {
                low=mid+1;
            }
            else if(requiredNum<arr[mid])
            {
                high=mid-1;
            }

        }

        System.out.println("count is "+count);
    }

  /*  public static int findOccur(int[] arr,int low ,int high,int num)
    {


    }*/
}
