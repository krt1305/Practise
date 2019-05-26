package Array;

public class MultipleMissingArrayElems {

    //https://javarevisited.blogspot.com/2018/04/how-to-find-k-missing-numbers-in-array-java.html#axzz5E2uHdG3w
    public static void main(String[] args) {
        int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
        int[] isElemPresent=new int[input.length];

        for(int i:input)
        {
            isElemPresent[i]=1;
        }
        System.out.println("Missing elems");
        for(int i=1;i<isElemPresent.length;i++)
        {
            if(isElemPresent[i]==0)
                System.out.println(i);
        }


    }


}
