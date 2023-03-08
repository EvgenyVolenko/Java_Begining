// 4*дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4

package Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Task_04_HW {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in,"Cp866");
        System.out.print("Введите первое число: ");
        double nA = iScanner.nextDouble();
        System.out.print("Введите один из знаков операции (+ - / *): ");
        String zn = iScanner.next();
        System.out.print("Введите второе число: ");
        double nB = iScanner.nextDouble();
        iScanner.close();
        double rez = 0;
        if (zn.equals("+")) rez = nA + nB; 
        if (zn.equals("-")) rez = nA - nB;
        if (zn.equals("*")) rez = nA * nB;
        if (zn.equals("/")) rez = nA / nB;
        System.out.printf("Результат вычисления = %s", rez);
        WriteToFile(nA, zn, nB, rez);
    }

    public static void WriteToFile(double a, String z, double b, double rezab) {
        String file_name = "rezcalc.txt";
        String rezToFile = a + " " + z + " " + b + " = " + rezab;
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(rezToFile);
            writer.write("\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }

}
