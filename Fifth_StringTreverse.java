import java.util.Scanner;

public class Fifth_StringTreverse {
    public static void reverseNumber(int orginalNumber) {
        int num = 0;
        while (orginalNumber > 0) {
            num = orginalNumber % 10;
            orginalNumber = orginalNumber / 10;
            System.out.print(num);
        }
    }

    public static void reverseString(String orginalString) {
        int len = orginalString.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(orginalString.charAt(i));
        }
    }

    public static void reverse(int orginalNumber) {
        int num = 0;
        while (orginalNumber > 0) {
            num = orginalNumber % 10;
            orginalNumber = orginalNumber / 10;
            System.out.print(num);
        }
    }

    public static void reverse(String orginalString) {
        // int len = orginalString.length();
        // for (int i = len - 1; i >= 0; i--) {
        // System.out.print(orginalString.charAt(i));
        // }
        System.out.println("Please input a string:");
        Scanner scanner = new Scanner(System.in);
        String orginalString2 = scanner.nextLine();

        reverse(orginalString2);
        System.out.println("input a number");
        int orginalNumber = scanner.nextInt(0);
        reverse(orginalNumber);
        scanner.close();
    }

    public static void main(String[] args) {
        int orginalNumber = 1234;
        reverseNumber(orginalNumber);
        String orginalString = "Today is a good day!";
        reverseString(orginalString);
    }

    public void testFinal() {
        System.out.println("String test");
    }
}
