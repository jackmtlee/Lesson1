package Lesson9;

import java.util.*;

public class SetTest {
    private void hashmap()
    {
        HashMap<String, String> hm = new HashMap();
        hm.put("1", "Tom");
        hm.put("2", "Jerry");
        hm.put("3", "spike");
        hm.put("1", "Tom");

        Set entry = hm.entrySet();
        Iterator iterator = entry.iterator();
        while (iterator.hasNext())
        {
            Map.Entry item = (Map.Entry)(iterator.next());
            Object key = item.getKey();
            Object value = item.getValue();
            System.out.println(key + "...." + value);
        }
        // an alternative way to visit the data in a map
        for(Map.Entry<String, String> entry1 : hm.entrySet()){
            System.out.println(entry1.getKey() + "...." + entry1.getValue());
        }
    }

    public static void main(String[] args) {}
}
