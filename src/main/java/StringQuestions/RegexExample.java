package StringQuestions;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        String word[] = { "welcome", "to", "geeks", "portal"};

        String str = "geeksforgeeks is a computer science portal for geeks.";
        int counter=0;
        HashSet<String> occur=new HashSet<>();
        Pattern p;
        Matcher matcher;

        for(String s:word)
        {
                p=Pattern.compile(s);
                matcher=p.matcher(str);
                while(matcher.find())
                {
                    System.out.println("FOund "+matcher.group());
                    occur.add(matcher.group());

                }

        }

        System.out.println("Occurs "+occur.size());


    }
}
