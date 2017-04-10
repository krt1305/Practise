package Data_structures;

public class Binary_Search {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr=new int[]{1,2,3,4,5,6};
		find(arr,4,arr.length);
		
		
		

	}
	public static void find(int[] arr,int data,int len) 
	
	{
		int low=0;
		int high=len-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(data==arr[mid])
				System.out.println("found at mid position");
		
			if (data< arr[mid])
			{
				high=mid-1;
				
			}
			else
			{
				low=mid+1;
			}
		}
		
		
	}

}
