// Напишите метод, который принимает на вход строку (String) и определяет 
// является ли строка палиндромом (возвращает boolean значение). Без встр. функций

package Seminar_2;

import java.util.Scanner;

public class Task_03_HW {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите строку: ");
        String name = iScanner.nextLine();
        iScanner.close();
        System.out.println(palindrom(name));
    }

    public static boolean palindrom(String str){
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            } else {
                return false;
            }
        }
        return true;
    }
}
