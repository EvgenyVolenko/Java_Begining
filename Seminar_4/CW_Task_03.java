// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.

package Seminar_4;

import java.util.Scanner;
import java.util.Stack;

public class CW_Task_03 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Scanner iScanner = new Scanner(System.in, "Cp866");

        while (true) {
            System.out.print("Введите строку: ");
            String text = iScanner.next();
            if (text.contains("print")) {
                outtext(st);
            } else {
                st.push(text);
            }
        }
    }

    public static void outtext(Stack<String> st) {
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
