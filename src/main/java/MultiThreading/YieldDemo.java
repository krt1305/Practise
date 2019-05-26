package MultiThreading;

public class YieldDemo {

    public static void main(String[] args) {

        MyThread thread1=new MyThread();
        thread1.start();

        for(int i=0;i<5;i++)
        {
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        }


    }

}

class MyThread extends Thread
{

   public void run()
   {
       for(int i=0;i<5;i++)
       {
           System.out.println(Thread.currentThread().getName());
       }
   }
}
