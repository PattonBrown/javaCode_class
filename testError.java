import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testError {
    public void testThrowable() throws IOException {

        FileReader fr = new FileReader("d:/unknow.txt");
        fr.close();
        throw new IOException("IOExpection");
    }

    public void testTrycatch() {
        FileReader fr;
        try {
            fr = new FileReader("d:/unknow1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (Throwable e) {
            System.out.println("IOExpection");
        } finally {
            System.out.println("test finally!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        testError test1 = new testError();
        test1.testTrycatch();

        System.out.println("After using tryCatch");
    }
}
