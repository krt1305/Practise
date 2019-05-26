package JavaINterrupts;

public class Interrupts {

    public static void main(String[] args) {
        Thread thread1=new Thread(new Task());
        thread1.start();
        System.out.println("Thread started ");
        System.out.println("Interrupting task");
        thread1.interrupt();
    }
}

class Task implements Runnable
{

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.println("In for loop "+i);
            if(Thread.currentThread().isInterrupted())
                return;

        }

    }
}
