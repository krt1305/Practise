package LinkedListDemo;

public class LinkedList {
    Node head;
    Node curr;
    Node prev;
    int length;

    public void add(int data)
    {

        Node n=new Node(data);
        if(head==null)
        {
            System.out.println("LinkedList is empty..adding as head");
            head=n;
            head.next=null;
            System.out.println("Node     is "+n);
        }
        else
        {
                curr=head;
                while(curr.next!=null) {

                    curr=curr.next;


                }
                curr.next=n;
                n.next=null;
        }
    }

    public void deleteNode(int data)
    {
        curr=head;
        System.out.println("Curret data is "+curr.data);
        while(curr.data!=data)
        {
            System.out.println(curr.data +" is not required node to be deleted");
            prev=curr;
            curr=curr.next;

        }
        System.out.println("Found node to be deleted");
        prev.next=curr.next;
        System.out.println("Prev data is "+prev.data);
        System.out.println("Prev next is "+prev.next);
        curr=null;



    }
    public void iterativeLength()
    {
        int length=0;
        curr=head;
        if(head==null)
        {
            length=0;
        }
        else {
            do {
                curr = curr.next;
                length++;
                System.out.println("lengh "+length);

            } while (curr!= null);
        }

        System.out.println("Length is "+length);

        System.out.println("Recursive lengh "+recursiveLength(head));

    }

    public int recursiveLength(Node n)
    {
        curr=n;
        if(n==null)
        {
            return 0;
        }
        else {

            return 1+recursiveLength(curr.next);

        }


    }

    public void reverseLinkedlist()
    {
        recursiveReverseLinkedList(head);

    }
    public void recursiveReverseLinkedList(Node n)

    {
        if(n==null)
            return;
        recursiveReverseLinkedList(n.next);
        System.out.println(n.data);

    }

    public void printLinkedList()
    {
        curr=head;

        while(curr.next!=null)
        {
            System.out.println(curr.data);
            System.out.println(curr.toString());
            curr=curr.next;

        }
        System.out.println(curr.data);
    }
}
