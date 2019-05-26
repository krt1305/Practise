package MultiThreading;

public class JoinDemo implements Runnable {


    //If join() is called on a Thread instance, the currently running thread will block until the Thread instance has finished executing.
    @Override
    public void run() {
        System.out.println("In run method");
        Thread t = Thread.currentThread();
        System.out.println("Current thread: "
                + t.getName());

        // checks if current thread is alive
        System.out.println("Is Alive? "
                + t.isAlive());
    }

    public static void main(String[] args) {
        System.out.println("In main mehod");
        Thread t=new Thread(new JoinDemo());
        t.start();
        try {
            t.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nJoining after 1000"+
                " mili seconds: \n");
        System.out.println("Current thread: " +
                t.getName());


        // Checks if this thread is alive
        System.out.println("Is alive? " + t.isAlive());
    }
}
