package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    public static void main(String[] args) {

       Map<String,String> map1=new HashMap();
        map1.put("name","abc");
        map1.put("address","address");

        Set<Map.Entry<String , String>> mappings=map1.entrySet();
        for(Map.Entry<String , String> map:mappings)
        {
            System.out.println(map.getKey());
            System.out.println(map.getValue());

        }

    }
}
