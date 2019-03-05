package Search;

public class BinarySearch {


    public static void main(String[] args) {
        int a[]={1,2,3,4};

        System.out.println("Found at index "+binarySearch(a,4));


    }

    public static int binarySearch(int a[],int x)
    {

        int mid,start,end;
        start=0;
        end=a.length-1;

        while(start<=end)
        {
            System.out.println("in whhile");
            System.out.println("start is "+start);
            System.out.println("end is "+end);
            mid=(start+end)/2;
            System.out.println("mid elem is "+a[mid]);
            if(x==a[mid])
                return mid;
            if(x<a[mid])
                end=mid-1;
            else
                start=mid+1;


        }


        return 1;

    }
}
