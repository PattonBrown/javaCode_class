public class App9_2 {
    public static void main(String[] args) {
        int i;
        int[] a = { 1, 2, 3, 4 };
        for (i = 0; i < 5; i++) {
            try {
                System.out.print("a[" + i + "]/" + "=" + (a[i] / i));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("Index error ");
            } catch (ArithmeticException e) {
                System.out.print("error is" + e);

            }

            catch (Exception e) {
                System.out.println("catch" + e.getMessage() + "error");
            } finally {
                System.out.println("finally i=" + i);
            }
        }
        System.out.println("Continue!");
    }
}
