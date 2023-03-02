// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
package Seminar_1;

import java.util.Scanner;

public class CW_Task_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in,"Cp866");
        System.out.printf("Введите свое имя: ");
        String name = iScanner.nextLine();
        iScanner.close();
        System.out.printf("Привет, %s!", name);
    }
}
