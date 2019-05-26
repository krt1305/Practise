package Lists;

public class LinkedList {
	
	Node head;
	Node tail;
	int size;
	
	public void add(int data)
	{
		//create a new node
		Node node=new Node(data);
		
		//1) Linked list is empty
		//2) Linked list is not empty
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.nextNode=node;
			tail=node;
				
		}
		
	}
	
	public void deleteNode()
	{
		
	}
	
	public void display()
	{ 
		//1) List is empty
		//2) Only one element
		//3) normal case
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else			
		{
			Node node=head;
			if(node.nextNode==null)
			{
				System.out.println(node.data);
				
			}
						
			else
			{	
				while(true)
				{
					if(node.nextNode!=null)
					{
						System.out.println(node.data);
						node=node.nextNode;
					}
					else
					{
						System.out.println(node.data);
						break;
					}					
					
				}
				
				
			}
			
		}

		
	}
	
	
	public Node find (int data)
	{
		//1) Empty linked list
		//2 ) Non empty linked list
		
		if(head==null)
		{
			return null;
		}
		
		Node node=head;
		
		while(node.nextNode!=null)
		{
			if(node.data==data)
			{
				return node;
			}
			node=node.nextNode;
		}
		return null;
	}
	
	
	public Node delete(int data)
	{
	
		//1) empty linked list
		//2) non empty linked list 
		     //1) delete at tail
             // 2) delete at head
              //3) delete in the middle
		Node node=head;
		Node prev = null,next;
		if(node !=null)
		{
			//1) delete at tail
			int s=size;
			int counter=0;
			while (counter !=(size-1))
			{
				counter++;
				node=node.nextNode;
			}
			prev=node;
			prev.nextNode=null;
		}		    			
			//2) delete at head
			
		node=head;
		head=node.nextNode;
			
	   //3)  delete in the middle
		node=head;
		while(true)
		{	
					
			if(node.data!=data)
			{
				prev=node;
				next=node.nextNode;
				
			}
			prev.nextNode=node.nextNode;
			
		}						
		
	}
	
	public int getData(int index)
	{
		Node node=head;
		int counter=1;
		while(counter!=index)
		{
			node=node.nextNode;
			counter++;
		}
		//System.out.println("Data is "+node.data);
		return node.data;
	}
	
	public int getSize()
	{
		int size = 0;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node node=head;
			if(node.nextNode==null)
			{
				size=size+1;
				
			}
				
			else
			{	
				while(true)
				{
					if(node.nextNode!=null)
					{
						node=node.nextNode;
						size=size+1;
					}
					else
					{

						size=size+1;
						break;
					}
					
					
				}
			
				
				
			}
			
		}
		return size;

		
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
		int counter=1;
		while (current!=null)
		{
			//take address backup
			//then assign new address
			
			next=current.nextNode;
			current.nextNode=prev;
			prev=current;
			current=next;
			
			
		}
		
		
	}
	

}


class Node
{
	
	int data;
	Node nextNode;
		
	Node()
	{
		
	}

	public Node(int data) 
	{
	    this.data=data;
	}
	
	@Override
	public String toString()
	{
		return ""+data;
		
	}
}

class TestLinkedList
{
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.display();
		int s=l.getSize();
		System.out.println("lInked list size is"+s);
		int data=l.getData(1);
		System.out.println("Data at index is"+data);
		
		
		//l.add(5);
	/*	System.out.println("Does it exist "+l.find(3));
		System.out.println("Does it exist"+l.find(10));
		System.out.println(l.getClass());
		System.out.println(l.getClass().getPackage());
		System.out.println("IS l interface "+l.getClass().isInterface());
		System.out.println("Is l array "+l.getClass().isArray())	;
		*/
		System.out.println("Done");
	}
	
}