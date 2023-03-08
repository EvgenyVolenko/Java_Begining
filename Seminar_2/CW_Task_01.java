// Дано четное число N (>0) и символы c1 и c2. Написать метод, который
// вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
// 6 a b
// Вернуть: ababab

package Seminar_2;

import java.util.Scanner;

public class CW_Task_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите число: ");
        int digit = iScanner.nextInt();
        iScanner.close();
        String c1 = "A";
        String c2 = "B";
        System.out.println(printNewstring (digit, c1, c2));
    }

    static String printNewstring (int d, String x1, String x2) {
        StringBuilder sb = new StringBuilder();
              
        for (int i = 0; i < d / 2; i++) {
            sb = sb.append(x1).append(x2);
        }
        
        return sb.toString();
    }
}
