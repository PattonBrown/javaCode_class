import java.util.Scanner;

public class Third_1_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plaese input 10 numbers :");
        int[] a = new int[10];
        int max, min;
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }

        max = min = a[0];
        for (int i = 0; i < 10; i++) {
            if (max <= a[i]) {
                max = a[i];
            }
            if (min >= a[i]) {
                min = a[i];
            }
        }
        System.out.println("max :" + max);
        System.out.println("min :" + min);
        scanner.close();
    }

}
