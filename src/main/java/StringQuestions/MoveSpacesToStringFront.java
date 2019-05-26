package StringQuestions;

import java.util.Queue;
import java.util.Stack;

public class MoveSpacesToStringFront {

    public static void main(String[] args) {
        String str="geeks for geeks";
        Stack s=new Stack();
        Stack s1=new Stack();
        char[] c=str.toCharArray();
        for(int i=0;i<=c.length-1;i++)
        {
            if(c[i]== ' ')
            {
                s.push(c[i]);
                System.out.println(s.peek());


            }
            else
            {
                s1.push(c[i]);
            }
        }
       while(!s1.empty())
       {
           System.out.println(s1.peek());
           s1.pop();
       }

        
    }
}
