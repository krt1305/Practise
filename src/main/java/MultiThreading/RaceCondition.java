package MultiThreading;

public class RaceCondition {


    public static void main(String[] args) {

        BankAccount task=new BankAccount();
        task.setBalance(100);
        Thread john=new Thread(task);
        Thread anita=new Thread(task);
        john.setName("john");
        anita.setName("anita");
        john.start();
        anita.start();


    }

}


class BankAccount implements Runnable{
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void run() {

        makewithdrawal(75);
        if(balance<0)
        {
            System.out.println("Money overdrawn");
        }
    }

    private synchronized void makewithdrawal(int amount)
    {

        if(balance>=amount)
        {
            System.out.println(Thread.currentThread().getName() +" is about to withdraw ");
            balance=balance-amount;
            System.out.println(Thread.currentThread().getName() +" has withdrawn "+ amount);
        }
        else
        {
            System.out.println("NOt enough balance");
        }
    }
}