package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Insert the element is its correct position..like a pack of cards
		int[] arr={9,6,5,0,8,2,7,1};
		int key,i;
			
			for(int j=1;j<arr.length;i++)
			{
				
				key=arr[j];
				System.out.println("Key is"+key);
				i=j-1;
				while(i>0 & arr[i]>key)
				{
					arr[i+1]=arr[i];
					i=i-1;
					
				}
				arr[i+1]=key;
				
				
			}
			
			for(int h=0;h<=arr.length-1;h++)
			{
				System.out.println(arr[h]);
			}
		

	}

}
