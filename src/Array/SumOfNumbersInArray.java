package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SumOfNumbersInArray {

    //How to Find all Pairs in Array of Integers Whose sum is Equal to a Given Number - Java Solution
    //
    //Read more: https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz5hIdpvaPq
    public static void main(String[] args) {
            int[] numbers={1,0,2,3};
            int requiredSum=4;
        Set set = new HashSet(numbers.length);
        System.out.println("Set length is "+set.size());
        Iterator it =set.iterator();
        while(it.hasNext())
        {
            System.out.println("in whiel");
            System.out.println("item "+it.next());
        }

        for(int n:numbers)
        {
            System.out.println("Array value is "+n);
            int target=requiredSum-n;
            System.out.println(requiredSum +"- "+ n + ": "+target);
            if(!set.contains(target)) {
                set.add(n);
                System.out.println("Adding to set" +n);
            }
            else {
                System.out.printf("(%d, %d) %n", n, target);
                System.out.println("Not Adding to set");

            }
        }
    }
}
