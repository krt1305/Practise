package StringQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveRecurringDigits {

    public static void main(String[] args) {
        String num="1299888833";
        char[] characters=num.toCharArray();
        LinkedHashSet<Character> hashSet=new LinkedHashSet<>();
        for(Character c:characters)
        {
            hashSet.add(c);
        }

        Iterator<Character> it=hashSet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
