// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку
// 2. сохранить text в связный список.
// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

// ввод asd
// [asd]
// ввод fdhg
// [asd, fdhg]
// ввод fvgh
// [asd, fdhg, fvgh]
// print~1
// вывод fdhg
// [asd, fvgh]

package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class CW_Task_02 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in, "Cp866");

        while (true) {
            System.out.print("Введите строку: ");
            String text = iScanner.next();
            if (text.contains("print~")) {
                int rem_ind = Integer.parseInt(text.split("~")[1]);
                try {
                    System.out.println(ll.get(rem_ind));
                    ll.remove(rem_ind);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Вылетел за пределы листа");
                }
            } else {
                ll.add(text);
            }
            System.out.println(ll);
        }
    }
}
