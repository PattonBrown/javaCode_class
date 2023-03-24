class Test {
    String name;
    int i;

    public void testMethod() {
        System.out.println("Test!");
    }
}

public class rubbish {

    public static void main(String[] args) {
        Test test = new Test();
        test.testMethod();

        test = null;
        System.gc();

        // test.finalze();

        try {

        } catch (Exception e) {
            System.gc();
        }
    }

}
