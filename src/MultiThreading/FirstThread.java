package MultiThreading;

import java.util.List;

public class FirstThread {


    public static void main(String[] args) {
        Task task=new Task();
        Thread thread=new Thread(task);
        thread.start();
        System.out.println("Inside main");

    }
}



class Task implements Runnable
{

    @Override
    public void run() {
        System.out.println("INside run");
        go();
    }

    private void go()
    {

        System.out.println("IN go");
        more();
    }

    private void more()
    {

        System.out.println("IN more");
    }
}