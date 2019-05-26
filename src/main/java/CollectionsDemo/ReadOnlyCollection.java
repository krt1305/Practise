package CollectionsDemo;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ReadOnlyCollection {

   // https://howtodoinjava.com/java/collections/useful-java-collection-interview-questions/#read_only_collection
//How to make a collection read only
   // Collections.unmodifiableList(list);
//Collections.unmodifiableSet(set);
//Collections.unmodifiableMap(map);

//If we try to modify after making it unmodifiable we get UnsupportedOperationException
    public static void main(String[] args) {

        List empList=new ArrayList();

        empList.add("1");
        empList.add("2");
        empList=Collections.unmodifiableList(empList);
        empList.add("8");


    }
}
