package StringQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumFromString {

    public static void main(String[] args) {
        String input="100klh564abc365bg";
        Pattern pattern=Pattern.compile("\\d+");
        Matcher matcher=pattern.matcher(input);

        int max=0;
        while(matcher.find())
        {
            System.out.println("Max is "+max);
            System.out.println(matcher.group());

            if(max<Integer.parseInt(matcher.group())) {

                System.out.println(matcher.group() +"  is greater than max");
                max = Integer.parseInt(matcher.group());
            }


        }

        System.out.println("Max is "+max);
    }
}
