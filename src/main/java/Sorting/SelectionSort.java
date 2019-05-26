package Sorting;

public class SelectionSort {

	public static void main(String[] args) 
	{

		//select the min element and insert it in its right position
		
		int[] arr={9,8,6,7,5,4,3};
		//int k=0,temp;
		//int min=arr[k];
		//int loc=k;
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			int minPos=i;
			for(int j=i; j<arr.length;j++)
			{
				if(arr[minPos]>arr[j])
				{
					minPos=j;
			
				}
			}
			temp=arr[i];
			arr[i]=arr[minPos];
			arr[minPos]=temp;
			      
		}
		
		
		System.out.println("Sorted array using selection sort is");
		for(int l=0;l<arr.length-1;l++)
		{
			System.out.println(arr[l]);
		}
		
		
		

	}

}
