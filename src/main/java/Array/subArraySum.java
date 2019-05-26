package Array;

public class subArraySum {

    public static void main(String[] args) {
        int arr[]={1,7,6,8};
        int sum=15,start=0;
        int reqSum=0;
        for(int i=0;i<=arr.length-1;i++)
        {


            reqSum=reqSum+arr[i];

             if(reqSum==sum)
            {
                System.out.println("Sum found");
            }
            else
            {
                while(reqSum>sum)
                {
                    reqSum=reqSum-arr[start];
                    start++;
                }
            }

           // System.out.println(reqSum);


        }

    }
}
