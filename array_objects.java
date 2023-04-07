public class array_objects {
    public static void main(String[] args) {
        person per[] = new person[3];
        System.out.print("array :");
        for (int i = 0; i < per.length; i++) {
            System.out.println(per[i] + ",");
        }
        per[0] = new person("zhangsan");
        per[1] = new person("lisi");
        per[2] = new person("wangwu");
        System.out.println("实例化：");
        for (int i = 0; i < per.length; i++) {
            System.out.print(per[i].getName() + ",");
        }
    }
}

class person {
    private String name;

    public person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
