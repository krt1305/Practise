package Data_structures;

import java.util.Arrays;

public class Stack {

	public String[] stackArray;
	public int stackSize;
	public int topStack=-1;
	
	Stack(int size)
	{
		stackSize=size;
		stackArray=new String[size];
		Arrays.fill(stackArray,"-1");
	}
	
	public void push(String input)
	{
		
		if(topStack+1 <stackSize)
		{
			topStack=topStack+1;
			stackArray[topStack]=input;
			
		}
		else
		{
			System.out.println("No room");
		}
	}
	
	public void display()
	{
		if(topStack==-1)
		{
			System.out.println("Stqck empty..nothing to display");
		}
		else
		{
			for(int i=0;i<=stackSize-1;i++)
			{
				System.out.println(stackArray[i]);
			}
		}
	}
	
	public void pop()
	{
		if(topStack==-1)
		{
			System.out.println("Nothing to pop");
		}
		else
		{
			topStack=topStack-1;
			
		}
	}
	
	public static void main(String arr[])
	{
		Stack s=new Stack(5);
		s.push("1");
		s.push("2");
		s.display();
		s.pop();
		s.display();
		
	}
	

}


