package StringQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationChars {

    public static void main(String[] args) {
          String INPUT = "Bb12\tc!";

        Pattern pt=Pattern.compile("\\p{Punct}");
        Matcher matcher=pt.matcher(INPUT);
        while(matcher.find())
        {
            System.out.println("FOund at "+ matcher.start());
        }

    }
}
