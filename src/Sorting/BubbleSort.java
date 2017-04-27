package Sorting;

public class BubbleSort {

	public static void main(String[] args)
	{

		int[] arr={9,8,6,7,5,4,3};
		int temp;
		for(int i=1;i<=arr.length-1;i++)
		{
			for(int j=0;j<=(arr.length-1-i);j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		System.out.println("Sorted array is");
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.println(arr[j]);
		}

	}

}
