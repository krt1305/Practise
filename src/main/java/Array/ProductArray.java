package Array;

public class ProductArray {

    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 6, 2};
        int product = 1;

        for(int i=0;i<=arr.length-1;i++)
        {

            product=1;
            for(int j=0;j<=arr.length-1;j++)
            {
                if(i==j){}
                    else{
                product=product*arr[j];

            }

            }
            System.out.println("Prdduct is "+product);
        }
    }
}
