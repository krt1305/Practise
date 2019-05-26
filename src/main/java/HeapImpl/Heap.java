package HeapImpl;

public class Heap {

    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int size) {
        this.maxSize = size;
        currentSize=0;
        heapArray=new Node[size];

    }

    public int getSize()
    {
        return currentSize;
    }

    public boolean isEmpty()
    {
        return (currentSize==0);

    }

    public boolean insert(int key)
    {
        if(currentSize==maxSize)
            return false;

        Node newNode=new Node(key);
        heapArray[currentSize]=newNode;
        trickleUp(currentSize);
        currentSize++;

        return  true;
    }

    public void trickleUp(int index)
    {
        int parentIndex=(index-1)/2;

    }
}
