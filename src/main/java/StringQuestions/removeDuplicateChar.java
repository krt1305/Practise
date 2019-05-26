package StringQuestions;

public class removeDuplicateChar {

    public static void main(String[] args) {
        String num="1299888833";
        String finalNum="";

        char charArray[]=num.toCharArray();
       for(int i=0;i<num.length()-1;i++)
       {
            System.out.println("while "+i);
            finalNum=finalNum+String.valueOf(charArray[i]);

            while( i +1<=num.length()-1 && charArray[i]==charArray[i+1])
            {
                i++;
            }


        }
        System.out.println("finalNum is "+finalNum);
    }
}
