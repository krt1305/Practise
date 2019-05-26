package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

public class IterateHashMap {

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put("name","rab");
        map.put("hobby","cooking");

        Set<Map.Entry<String,String>> mapIterator=map.entrySet();
        for(Map.Entry<String,String> entry:mapIterator)
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        //oNly keys
        System.out.println("KEYS------");
        Set<String> keys=map.keySet();
        for(String s:keys)
        {
            System.out.println(s);
        }

        System.out.println("VALUES------");
        Collection<String> values=map.values();
        for(String s:values)
        {
            System.out.println(s);
        }



    }
}


