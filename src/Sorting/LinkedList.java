package Sorting;



public class LinkedList {

	Node head;
	Node tail;
	int size=0,counter;
	
	
	public Node delete(int data)
	{
		Node node=head;
		Node prev = null,current = null,nextNode;
		if(head==null)
		{
			System.out.println("Nothing to delete");
		}
		// if there is only one element
		if(head.next==null)
		{
			System.out.println("Only head present.Deleting head");
			head=null;
			tail=null;
			return null;
		}
		else
		{
			//1) delete head node
			//2) delete tail
			//3) delete in middle
			
			if(data==node.data)
			{
				head=node.next;
				System.out.println("Deleting head node");
				return head;
			}
			
			//delete tail
			if(tail.data==data)
			{
				System.out.println("In tail section");
				current=head;
				while(current.next!=null)
				{
					System.out.println("In while");
					prev=current;
					current=current.next;
					
				}
				System.out.println("Deleting tail node");
				prev.next=null;
				prev=tail;
				
				return current;
			}
			
		  //	==============================================
		 //	    delete in middle
			current=head;
			while(true)
			{
				
				System.out.println("Deleting in middle");
				if(current.data==data)
				{
					prev.next=current.next;
					System.out.println("Deleting node is between");
					break;
				}
				else
				{
					//nextNode=current.next;
					nextNode=current.next;
					//current=current.next;
					prev=current;
					current=nextNode;
					System.out.println("Current ");
										
					
				}
				
			}
			return current;
 			
		}
		
		
		
		
	}
	
	public void reverse()
	{
		Node node=head;
		Node current = head, prev=null,next	;
		//empty list
		// list with size 1
		// list with multiple size
		if(head==null)
		{
			System.out.println("Nothing to reverse");
		}
		int counter=0;
		int lsize=getSize();
		System.out.println("List size in reverse function is "+lsize);
		while(true)
		{
			if(counter==lsize)
			{
		
				break;
				
			}
			else
			{

			
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
				counter=counter+1;
			}
		}
	/*	while (current!=null)
		{
			//take address backup
			//then assign new address
			
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
			
		}
		*/
	}
	
	
	public void add(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{		
			head=node;
			tail=node;
			
		}
		else
		{
		   tail.next=node;
           tail=node;
			
		}
		
	}
	
	public  int getItemAtIndex(int index)
	{
		Node node=head;
		int counter = 0;
		while(counter!=index)
		{
			node=node.next;
			counter++;
		}
		return node.data;
		
	
	
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("Nothing to display");
		}
		else
		{
			Node node=head;
			if(head.next==null)
			{
				System.out.println(node.data);
			}
			else
			{
				while(true)
				{
					if(node.next==null)
					{
						System.out.println(node.data);
						break;
					}
					else
					{
						System.out.println(node.data);
						node=node.next;
					}
					
				}
			}
		}
	}
	
	public int getSize()
	{
		Node node=head;
		counter=0;
		if(head==null)
		{
			System.out.println("Size is empty");
		}
		else
		{
			if(head.next==null)
			{
				size=size+1;
			}
			else 
			{
				while(node.next!=null)
				{
					counter=counter+1;
					node=node.next;
				}
			}
			size=counter+1;
		
		}
		
		return size;
	}
	
	public static void main(String[] args)
	{

		LinkedList l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.display();
		System.out.println("Item at index 1 is "+ l.getItemAtIndex(1));
	    int listSize=l.getSize();
	    System.out.println("List size is"+listSize);	
//	    l.reverse();
//	    System.out.println("List after reversing ");
	//    l.display();
	    l.delete(2);
	    System.out.println("List after deletion");
	    l.display();
	    

	}	
	
}


class Node
{
	int data;
	Node next;
	Node()
	{
		
	}
	
	Node(int data)
	{
		this.data=data;
	}
	
}
