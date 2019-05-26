package StringQuestions;

import java.util.HashSet;
import java.util.Iterator;

public class SubSequence {

    public static void main(String[] args) {
        String str="abc";
        HashSet<String> subsequence=new HashSet<>();
        for(int i=0;i<=str.length()-1;i++)
        {
            System.out.println("I is "+i);
            for (int j = str.length(); j > i; j--)
            {
                    System.out.println("J is "+j);
                    System.out.println("Substring " + str.substring(i, j));
                    subsequence.add(str.substring(i, j));

            }
        }


        Iterator<String> it=subsequence.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());
       }
        System.out.println("Size "+subsequence.size());
    }
}
