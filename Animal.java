
class Duck extends Animal {
    int numberOfwing = 2;

    public void walk() {
        System.out.println("my 2 legs is running ");
    }
}

class Dog extends Animal {// 只有一个唯一父类
    @Override // 提示覆盖父类方法
    public void saySomething() {
        // TODO Auto-generated method stub
        super.saySomething();
        System.out.println("Wang!");
    }

    Dog() {
        super("max");
        System.out.println("This is dog");
    }

    public void walk() {
        System.out.println("my 4 legs is running ");
    }
}

class Pets {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class Animal extends Pets {
    public Animal(String name) {
        setName(name);
    }

    public Animal() {
        System.out.println("This is animal");
    }

    public void saySomething() {
        System.out.println("Hello");
        System.out.println("Hello Word!");
    }

    public static void main(String[] args) {
        // Duck duck = new Duck();
        // duck.saySomething();
        // duck.setName("xiaoHuang");

        Dog dog = new Dog();
        // dog.saySomething();
        // dog.setName("xiaobai");
    }
}
