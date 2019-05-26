package StringQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxVotes {

    public static void main(String[] args) {
        String votes[] = {"john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john"};

        int count=0;
        HashMap<String,Integer> map=new HashMap<>();
        Pattern pattern;
        Matcher matcher;
        int occur=1;

        for(int i=0;i<=votes.length-1;i++)
        {

                 System.out.println(votes[i]);
                if(map.get(votes[i])==null)
                {

                    System.out.println("Does not occur..putting "+occur);
                    map.put(votes[i],occur);
                }
                else
                {

                    occur=map.get(votes[i]);
                    System.out.println("Already exists "+votes[i]+ " "+occur);
                    map.put(votes[i],occur++);
                    System.out.println("After putting "+occur);


                }

            System.out.println("----------------------------");


        }


        for (Map.Entry<String,Integer> entry : map.entrySet())
            {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
}
