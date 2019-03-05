import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'getMinimumDifference' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     */




    public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {

        int count=0;
        int char_count[]=new int[26];
        List<Integer> diff_result=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            String string1=a.get(i);
            String string2=b.get(i);

            if(string1.length()==string2.length()) {
                for (int j = 0; j < string1.length()-1; j++) {

                    char_count[string1.charAt(j) - 'a']++;
                }
                for (int k = 0; k < string2.length()-1; k++) {

                    if (char_count[string2.charAt(k) - 'a']-- <= 0) {
                        count++;
                    }
                    else
                    {

                        count=0;
                    }
                }
            }
            else{

                count=-1    ;
            }

            diff_result.add(count);

        }
        // Write your code here
        System.out.println(diff_result);
        return diff_result;
    }
    // Write your code here


}
