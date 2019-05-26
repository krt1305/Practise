public class MissingNumberInArray {


    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,8};
        int sum=0;
        int requiredSum;
        int length=a.length+1;
        for(int x:a)
        {
            System.out.println("num is "+x);
                sum=sum+x;
        }
        System.out.println("Array sum is "+sum);
        requiredSum=(length*(length+1))/2;
        System.out.println("required sum is "+requiredSum);
        System.out.println("Missing number is "+(requiredSum-sum));
    }
}
