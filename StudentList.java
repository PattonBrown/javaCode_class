class Student {
    private String name;
    private String id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Student id[" + id + "],name[" + name + "].";
    }

    public Student(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }
}

public class StudentList {
    Student list[];
    int count;

    public StudentList(int max) {
        list = new Student[max];
        count = 0;
    }

    public boolean add(Student student) {
        if (student == null) {
            return false;
        }
        if (list.length <= count)
            return false;
        list[count] = student;
        count++;
        return true;

    }

    public boolean remove(int index) {
        if (index >= count || index < 0)
            return false;
        list[index] = null;
        return true;
    }

    public int indexOf(String id) {
        for (int i = 0; i < list.length && list[i] != null; i++) {
            if (list[i].getId().equals(id))
                return i;
        }
        return -1;
    }

    public Student get(int index) {
        return list[index];
    }

    public int size() {
        return count;
    }

    public String toString() {
        String msg = "";
        for (int i = 0; i < list.length && list[i] != null; i++) {
            msg = msg + list[i].toString() + "\n";
        }
        return msg;
    }
    public static void main(String[] args) {

    }
}
