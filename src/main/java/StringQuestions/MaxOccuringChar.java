package StringQuestions;

public class MaxOccuringChar {

    public static void main(String[] args) {
        int count[] = new int[256];
        String str = "sample string";

        for(int i=0;i<str.length();i++)
        {

            count[(int)str.charAt(i)]++;
        }

        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        System.out.println("Result is "+result);
    }


}
