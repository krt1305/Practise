package ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class UseBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<Integer>(10);
        Thread thread1=new Thread(new Producer(blockingQueue));
        Thread thead2=new Thread(new Consumer(blockingQueue));
        thread1.start();
        thead2.start();



    }
}

class Producer implements Runnable
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

        System.out.println("Producer produced thread "+i);
        try {
            blockingQueue.put(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class Consumer implements  Runnable
{

    BlockingQueue<Integer> blockingQueue=null;

    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        while(true)
        {
            consume();
        }

    }


    public void consume()
    {

        try {
            System.out.println("consumer consumed elem "+blockingQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
