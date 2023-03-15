// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9

// Пример 2
// Ввод: 1
// Ввод: +
// Ввод: 2
// Вывод: 3
// Ввод:+
// Ввод:4
// Вывод 7
// Ввод:*
// Ввод:3
// Вывод 21
// Отмена
// Вывод 7
// Отмена
// Вывод 3
// Ввод:-
// Ввод:1
// Вывод 2

// Дополнительно каскадная отмена - отмена нескольких операций

package Seminar_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task_03_HW {
    public static void main(String[] args) {
        Deque<Double> deque = new ArrayDeque<>();
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите первое число: ");
        String otmena = iScanner.next();
        double nA = Double.parseDouble(otmena);
        System.out.print("Введите один из знаков операции (+ - / *): ");
        String zn = iScanner.next();
        System.out.print("Введите второе число: ");
        double nB = iScanner.nextDouble();
        double rez = schet(nA, nB, zn);
        System.out.printf("Результат вычисления = %s\n", rez);
        deque.addFirst(rez);
        System.out.println(deque);

        while (true) {
            System.out.print("Введите один из знаков операции (+ - / *) или \"отмена\" : ");
            zn = iScanner.next();
            if (zn.equals("отмена")) {
                deque.removeFirst();
                System.out.println("Предыдущий результат = " + deque.peekFirst());
            } else {
                System.out.print("Введите второе число: ");
                nB = iScanner.nextDouble();
                rez = schet(deque.peekFirst(), nB, zn);
                deque.addFirst(rez);
                System.out.printf("Результат вычисления = %s\n", rez);
                System.out.println(deque);
            }
        }
    }

    public static double schet(double a, double b, String z) {
        double r = 0;
        if (z.equals("+")) {
            r = a + b;
        } else if (z.equals("-")) {
            r = a - b;
        } else if (z.equals("*")) {
            r = a * b;
        } else if (z.equals("/")) {
            r = a / b;
        }
        return r;
    }
}
