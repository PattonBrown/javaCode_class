import java.text.DecimalFormat;

interface IShape {
    static final double PI = 3.14;

    double getarea();

    abstract double getLength();
}

class Circle1 implements IShape {
    double radius;

    public Circle1(double r) {
        radius = r;
    }

    public double getarea() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }
}

class Rectangel implements IShape {
    private double width;
    private double hight;

    public Rectangel(double width, double hight) {
        this.hight = hight;
        this.width = width;
    }

    public double getarea() {
        return width * hight;
    }

    public double getLength() {
        return 2 * (width + hight);
    }

    public static class App8_12 {
        public static void main(String[] args) {
            IShape circle = new Circle1(5.0);
            DecimalFormat df = new DecimalFormat("0.00");
        }
    }

}
