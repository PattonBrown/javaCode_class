public class Cylinder {
    double radius;
    int hight;
    final double PI = 3.14;

    void area() {
        System.out.println("圆柱体面积=" + PI * radius * radius);
    }

    void volume() {
        System.out.println("圆柱体积=" + PI * radius * radius * hight);
    }

    public double getRadious() {
        return this.radius;
    }

    public int getHight() {
        return this.hight;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public static void test() {
        // final int test = 0;
        // System.out.print(test);
        int[] array = { 1, 2, 3, 4 };
        int[] array2 = array;
        for (int i = 0; i < 4; i++) {
            System.out.println(array2[i]);
        }
    }

    Cylinder() {

    }

    Cylinder(double r, int h) {
        radius = r;
        hight = h;
    }

    public static void main(String[] args) {
        // Cylinder cylinder = new Cylinder();
        // cylinder.hight = 3;
        // cylinder.radius = 2;
        // cylinder.getHight();
        // cylinder.getRadious();
        // cylinder.getArea();
        // cylinder.area();
        // cylinder.volume();
        // Cylinder cylinder2 = new Cylinder(2, 3);

        // cylinder.setRadius(2);
        // System.out.println(cylinder.getHight());
        // System.out.println(cylinder.getRadious());

        // cylinder2.area();
        // cylinder2.volume();

        new Cylinder(4, 5).area();

        test();

    }
}
