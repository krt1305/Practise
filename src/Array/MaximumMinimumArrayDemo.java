package Array;

public class MaximumMinimumArrayDemo {

    public static void main(String[] args) {
        int largest=Integer.MIN_VALUE;;
        int smallest = Integer.MAX_VALUE;

        int numbers[]={1,-9,0,8,10};

        for(int number:numbers)
        {
            if(number>largest)
                largest=number;
            else if(number<smallest)
                smallest=number;
        }
        System.out.println("Largest number "+ largest);
        System.out.println("Smallest number "+smallest);

    }
}
