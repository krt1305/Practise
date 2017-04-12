package Data_structures;

public class BST {
	Node1 root;
	
	public void add(int data)
	{
		
		Node1 node=new Node1(data);
		if(root==null)
		{
			root=node;
		}
		else
		{
			Node1 focusNode = null;
			while(true)
			{
				if(data<root.data)
				{
					focusNode=focusNode.lchild;
					if(focusNode==null)
					{
						root.lchild=node;
					}
					
				}
				else
				{
					focusNode=focusNode.rchild;
					if(focusNode==null)
					{
						root.rchild=node;
					}
				}
			}
		}
		
		
	}
	
	public void inOrderTraverse(Node1 node)
	{
		if(node!=null)
		{
			inOrderTraverse(node.lchild);
			inOrderTraverse(node.rchild);
		}
		
	}
	
	public void preOrderTraverse()
	{
		
	}
	
	public void main(String args[])
	{
		BST tree=new BST();
		tree.add(10);
		tree.add(1);
		tree.add(20);
		
		tree.inOrderTraverse(tree.root);
		
	}

}




class Node1
{
	int data;
	Node1 lchild;
	Node1 rchild;
	
	
	Node1(int data)
	{ 
		this.data=data;
		
	}
	
}