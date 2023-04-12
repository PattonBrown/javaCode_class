package javaProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    class Comp implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            if (o1.id.equals(o2.id))
                return 0;
            if (o1.id.charAt(0) > o2.id.charAt(0))
                return 1;
            return -1;
        }
    }

    class myStudent extends Student {

        myStudent(String name, String id) {
            super(name, id);
        }

    }
}

public class M_STL {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("test", "test"));
        list.add(new Student("test1", "abc"));
        list.add(new Student("test2", "def"));

        System.out.println(list.size());

        list.sort(new Comp());

        for (Student stu : list) {
            System.out.println(stu.id);
        }
    }

}
