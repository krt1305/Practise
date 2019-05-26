package Data_structures;

public class CircularQueue {

	int front=-1 , rear=1;
	int qsize;
	int[] cq;
	
	
	CircularQueue(int size)
	{
		qsize=size;
		cq=new int[size];

	}
	
	public void insert(int data)
	{
		if((rear+1)%qsize==front)
		{
			System.out.println("Queue is full");
		}
		else if(isEmpty())
		{
			front=0;
			rear=0;
		}
		else
		{
			rear=(rear+1)%qsize;
		}
			
		cq[rear]=data;
	}
	
	public void delete()
	{
		if(isEmpty())
		{
			System.out.println("Circular queue is empty..nothing to delete");
		}
		else if (front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			front=front+1;
		}
		
	}
	
	public boolean isEmpty()
	{
		if (front==-1 && rear==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display()
	{
		
	}

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueue cq=new CircularQueue(5);
		
		

	}
	

	
	
}
