package javaProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<String>();

        List.add("test1");
        List.add("test3");
        System.out.println(List.contains("test3"));

        for (String str : List) {
            System.out.println(str);
        }

        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
        System.out.println("---------");
        Iterator<String> ite = List.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
        System.out.println("-------");

        System.out.println(List.size());

        List.remove(0);
        String str = List.get(0);
        System.out.println(str);
        System.out.println(List.size());
        System.out.println(List.get(0));

        LinkedList<String> list2 = new LinkedList<>();

    }
}
