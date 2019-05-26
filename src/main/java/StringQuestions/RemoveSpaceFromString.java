package StringQuestions;

import java.util.Stack;

public class RemoveSpaceFromString {

    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/remove-spaces-from-a-given-string/

        String str="g  eeks   for ge  eeks  ";
        Stack s=new Stack();
        char[] c=str.toCharArray();
        for(int i=0;i<=c.length-1;i++)
        {
            if(c[i]!= ' ')
            {
                    s.push(c[i]);
                     System.out.println(s.peek());
            }
        }



    }
}
