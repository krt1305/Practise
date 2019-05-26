package StringQuestions;

public class CharCount {

    public static void main(String[] args) {

        String str = "GeeksforGeeks";
        int[] count=new int[256];
        char[] indexpos=new char[256];
        char[] charArray=str.toCharArray();

        for(int i=0;i<=str.length()-1;i++)
        {
           count[(int)str.charAt(i)]++;
            indexpos[(int)str.charAt(i)]=str.charAt(i);

        }

        for(int i=0;i<=count.length-1;i++)
        {
            if(count[i]==1)
            System.out.println(indexpos[i]);
        }

    }
}
