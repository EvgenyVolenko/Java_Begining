/**
 * Program
 */
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        String msg = "Goodbye world";
        int a = 123;
        a = a-- - --a;
        System.out.println(a);
        System.out.println(msg);

        int[] arr[] = new int[3][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }
}
