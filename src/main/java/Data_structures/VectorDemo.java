package Data_structures;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> nameList=new Vector<>();
        nameList.add("vector1");
        nameList.add("vector") ;
        for(String j:nameList)
        {
            System.out.println(j);
        }
    }
}
