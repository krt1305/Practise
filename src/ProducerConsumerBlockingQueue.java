import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {


    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<Integer>(10);
        Thread producerThread=new Thread(new Producer(blockingQueue));
        Thread consumerThread=new Thread(new Consumer(blockingQueue));
        producerThread.start();
        consumerThread.start();



    }
}


class Producer implements  Runnable
{

    BlockingQueue<Integer> blockingQueue=null;
    private int i=0;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        while(true)
        {
            produce(i++);
        }

    }



    public void produce(int i)
    {
        System.out.println("Producing elem "+ i);
        try {
            blockingQueue.put(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class Consumer implements Runnable

{


    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    BlockingQueue<Integer> blockingQueue=null;
    @Override
    public void run() {

        while(true)
        {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void consume() throws InterruptedException {
        System.out.println("Consumer consumed elem "+ blockingQueue.take());

    }
}