package MultiThreading;

import java.util.ArrayList;

public class SyncStaticBlock {

    public static void main(String[] args) {
        for(int i=0;i<100;i++)
        {

            new NumberThread(i);
        }
        StaticList.displayList();

    }
}

class StaticList
{
    private static ArrayList<Integer> numberList=new ArrayList<>();
    static void addToList(Integer number)
    {
        numberList.add(number);

    }

    static void displayList()
    {
        System.out.println(numberList);
    }
}


class NumberThread implements  Runnable
{
private int number=0;

    @Override
    public void run() {

        StaticList.addToList(number);
    }

    public NumberThread(int number) {
        this.number = number;
        new Thread(this).start();
    }
}
