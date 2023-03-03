// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package Seminar_1;

import java.util.Scanner;

public class Task_03_HW {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in,"Cp866");
        System.out.printf("Введите первое число: ");
        double nA = iScanner.nextDouble();
        System.out.printf("Введите один из знаков операции (+ - / *): ");
        char zn = iScanner.next().charAt(0);
        System.out.printf("Введите второе число: ");
        double nB = iScanner.nextDouble();
        iScanner.close();
        double rez = 0;
        if (zn == '\u002b') rez = nA + nB; 
        if (zn == '\u002d') rez = nA - nB;
        if (zn == '\u002a') rez = nA * nB;
        if (zn == '\u002f') rez = nA / nB;
        System.out.printf("Результат вычисления = %s", rez);
    }
}
