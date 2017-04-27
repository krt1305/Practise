package Trees;

public class BinarySearchTree {

	Node1 root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree=new BinarySearchTree();
		tree.add(50);
		tree.add(25);
		tree.add(15);
	    tree.add(30);
		tree.add(75); 
		tree.add(85);
		tree.add(90);
		

		System.out.println("In order traversal");
		System.out.println("==============================");
		tree.inOrderTraverse(tree.root);
		System.out.println("Pre order traversal");
		System.out.println("==============================");
		tree.preOrderTraverse(tree.root);
		System.out.println("Finding in tree");
		System.out.println(tree.findNode(50));
		
		tree.minElem();
     	tree.maxElem();
     	tree.findHeight();

	}
	
	
	public void maxElem()
	{
		if(root==null)
		{
			System.out.println("No elemnets in the tree");
			
		}
		else
		{
			Node1 current=root;
			while(current.rchild!=null)
			{
				current=current.rchild;
			}
			System.out.println("Max is "+current.data);
		}
	}
	
	public void minElem()
	{
		if(root==null)
		{
			System.out.println("Tree is empty");
		}
		else
		{
			Node1 current=root;
			while(current.lchild!=null)
			{
				current=current.lchild;
				System.out.println("In while----------");
				System.out.println(current.data);
			}
			System.out.println("Min data is "+current.data);
		}
		
	}
	
	
	public void add(int data)
	{
		
		Node1 node=new Node1(data);
		if(root==null)
		{
			root=node;
		}
		else
		{
			Node1 focusNode = root;
			Node1 parent;
			while(true)
			{
				parent=focusNode;
				if(data<focusNode.data)
				{
					
					focusNode=focusNode.lchild;
					if(focusNode==null)
					{
						parent.lchild=node;
						return;
					}
					
				}
				else
				{
					focusNode=focusNode.rchild;
					if(focusNode==null)
					{
						parent.rchild=node;
						return;
					}
				}
			}
		}
		
		
	}
	
	
	public boolean delete(int data)
	{
		Node1 focusNode=root;
		while(focusNode.data!=data)
		{
			
			if(data<focusNode.data)			
				focusNode=focusNode.lchild;
			else
				focusNode=focusNode.rchild;
				
			if(focusNode==null)
				return false;
		}
		
		if(focusNode.lchild==null &&  focusNode.rchild==null)
		{
			if(focusNode==root)
				root=null;
		
			
		}
		
		
		return false;
		
	}
	
	public void findHeight()
	{
		// Height of a tree is the longest edge from root to leaf node
		// Calculate height of left subtree and then right subtree
		// Max of both would be height of the tree
		if(root==null)
		{
			System.out.println("Tree is empty");
		}
		else if(root.lchild==null && root.rchild==null)
			
		{
			System.out.println("Only root exists..height is 0");
		}
		else
		{
			//Get height of left subtree
			int leftHeight=0,rightHeight=0;
			Node1 current=root;
			while(current.lchild!=null)
			{
				leftHeight=leftHeight+1;
				current=current.lchild;
				
			}
			System.out.println("Left height is"+leftHeight);
			current=root;
			while(current.rchild!=null)
			{
				rightHeight=rightHeight+1;
				current=current.rchild;
				
			}
			System.out.println("RIght height is"+rightHeight);
			if(rightHeight==leftHeight)
			{
				System.out.println("Tree height is" +(rightHeight));
			}
			else if(rightHeight>leftHeight)
			{
				System.out.println("Tree height is" +(rightHeight));
			}
			else 
			{
				System.out.println("Tree height is" +(leftHeight));
			}
		}
		
	}
	
	public void inOrderTraverse(Node1 node)
	
	{		
		//Depth first traversal consists of 3 types:
		// 1) INorder 
		// 2) Postorder
		// 3) Preorder
		if(node!=null)
		{
			inOrderTraverse(node.lchild);
			System.out.println(node);
			inOrderTraverse(node.rchild);
		}
		
	}
	
	public void preOrderTraverse(Node1 node)
	{
		if(node!=null)
		{
			System.out.println(node);
			preOrderTraverse(node.lchild);
			preOrderTraverse(node.rchild);
		}
		
	}
	
	public void breadthFirstTraverse()
	{
		Node1 current=root;
		if(current!=null)
		{
			System.out.println();
		}
	}
	
	
	
	
	public Node1 findNode(int data)
	{
	
		
		Node1 focusNode=root;
		while(focusNode.data!=data)
		{
			if(data<focusNode.data)
				focusNode=focusNode.lchild;
			else
				
				focusNode=focusNode.rchild;
			if(focusNode==null)
				return null;
		}
		
		
		
	return focusNode;
		
	}

	

}


class Node1

{
	int data;
	int minElem,maxElem;
	Node1 lchild;
	Node1 rchild;
	int treeHeight;
	
	Node1(int data)
	{
		this.data=data;
		
	}
	@Override
	public String toString()
	{
		return ""+data;
		
	}
}
