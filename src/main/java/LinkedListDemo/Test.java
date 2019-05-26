package LinkedListDemo;

public class Test {

    public static void main(String[] args) {

        LinkedList l=new LinkedList();

        l.add(5);
        l.add(10);
        l.add(90);
        l.add(80);
        l.add(20);
        System.out.println("Linked list after addition");
        l.printLinkedList();
    /*    l.deleteNode(90);
        System.out.println("Linked list after deletion");
        l.printLinkedList();*/
        System.out.println("Iterative length is ");
        l.iterativeLength();
        l.reverseLinkedlist();

      //  l.recursiveLength();
    }
}
