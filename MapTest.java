package javaProject;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<Integer, String>();

        // Map<Integer, Map<Integer, String>> map2 = new HashMap<Integer, Map<Integer,
        // String>>();

        map1.put(1, "First");
        map1.put(2, "Second");
        map1.put(3, "Third");
        map1.put(100, "1 hundred");

        // System.out.println(map1.get(1));
        // map1.remove(3);
        // System.out.println(map1.get(3));
        Set<Integer> entry4Key = map1.keySet();

        for (Integer in : entry4Key) {
            System.out.println(in);
        }

        Collection<String> entry4Value = map1.values();
        for (String str : entry4Value) {
            System.out.println(str);
        }

        for (Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
