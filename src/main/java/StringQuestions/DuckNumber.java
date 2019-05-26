package StringQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuckNumber {

    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/check-whether-number-duck-number-not/

        //A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number.
        String num="0123";
        Pattern p=Pattern.compile("^0");
        Matcher m=p.matcher(num);
        while(m.find())
        {
            System.out.println("Found 0 at the beginning.Not a duck number");
        }



    }
}
