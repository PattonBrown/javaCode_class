class ClaA {

}

class ClaB extends ClaA {
    int x;
}

class ClaC extends ClaB {
    int y;
}

public class App8_10 {
    static ClaA getobj(int n) {
        switch (n) {
            case 0:
                return new ClaA();
            case 1:
                return new ClaB();
            default:
                return new ClaC();
        }

    }

    public static void main(String[] args) {
        ClaA m1 = getobj(0);
        ClaA m2 = getobj(1);
        ClaA m3 = getobj(2);
        System.out.println("m1所指向的类:" + m1.getClass());
        System.out.println("m2所指向的类:" + m2.getClass());
        System.out.println("m3所指向的类:" + m3.getClass());
    }
}
