// Вывести все простые числа от 1 до 1000

package Seminar_1;

public class Task_02_HW {
    
    static int simple(int n) {
        String deliteli = "";
        int counter = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                deliteli += i + " ";
            }
        }
        for (int j = 0; j < deliteli.length(); j++) {
            if (deliteli.charAt(j) == '\u0020') {
                counter++;
            }
        }
        if (counter == 1) {
            return n;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String rez = "";
        for (int i = 2; i < 1001; i++) {
            int simpleDigit = simple(i);
            if (simpleDigit != 0) {
                rez += simpleDigit + ", ";
            }
        }
        System.out.println(rez);
    }
}
