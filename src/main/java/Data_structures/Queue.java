package Data_structures;

public class Queue 
{
	    //can be implemented using array , dynamic array or linked list

		int front=-1,rear=-1;
        int qsize;
        int noOfiTems;
        int[] queueArray;
        
        Queue(int size)
        {
        	qsize=size;
        	queueArray=new int[size];
        }
		
		public void delete()
		{
			//DELETION HAPPENS FROM THE FRONT END
			//1. deletion from empty queue 
			if(noOfiTems==0)
			{
				System.out.println("No items to delete from queue");
			}
			else
			{
				
				front=front+1;
				queueArray[front]=-1;	
				noOfiTems=noOfiTems-1;
	
			}
			
			
		}
		
		public void insert(int data)
		{
			//INSERTION HAPPENS AT REAR END
			
			//1. If the queue is full insertion cannot happen
			if(noOfiTems==qsize)
			{
				System.out.println("Queue is full..cannot be inserted");
			}
			else
			{
				rear=rear+1;
				queueArray[rear]=data;
				noOfiTems=noOfiTems+1;
				System.out.println("INSERTED "+data);
			}
			
			
		}
		
		public void priorityInsert(int data)
		{
			
		}
		public void display()
		{
			System.out.println("Queue items");
			if(noOfiTems>0)
			{
				for(int i=front+1;i<=rear;i++)
				{
					
					System.out.println(queueArray[i]);
				}

		
			}
			else
			{
				System.out.println("Nothing to display");
			}
				
		}
		public static void main(String arr[])
		{
			Queue q=new Queue(5);
			q.insert(1);	
			q.insert(2);
			q.insert(3);
			q.insert(4);
			q.delete();
		    System.out.println("Queue after deletion");
		    q.display();
			
		}
		
		
}
