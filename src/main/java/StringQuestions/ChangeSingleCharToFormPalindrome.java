package StringQuestions;

public class ChangeSingleCharToFormPalindrome {

    public static void main(String[] args) {
        String s1="abccaa";
        int size=s1.length()-1,count=0;
        for(int i=0;i<size;i++)
        {
            if(s1.charAt(i)!=s1.charAt(size)) {
                    count++;
            }
            size--;

        }
        System.out.println("Count is "+count);
    }
}
