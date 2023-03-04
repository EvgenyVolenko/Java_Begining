// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

package Seminar_1;

import java.util.Scanner;

public class Task_04_HW {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.printf("Введите выражение: ");
        String name = iScanner.nextLine();
        iScanner.close();
        name = name.replaceAll("\\s", "");
        String[] parts = name.split("=");
        String rezR = parts[1];
        String rezL = parts[0];
        parts = rezL.split("\\+");
        String rezLa = parts[0];
        String rezLb = parts[1];
        int rezLa0 = 0;
        int rezLa1 = 0;
        int rezLb0 = 0;
        int rezLb1 = 0;
        int temp = 0;

        int indexLa = rezLa.indexOf('?');
        int indexLb = rezLb.indexOf('?');
        int rezRD = Integer.parseInt(rezR);
               
        if (indexLa == 0 && indexLb == 0) {
            rezLa1 = Integer.parseInt(Character.toString(rezLa.charAt(1)));
            rezLb1 = Integer.parseInt(Character.toString(rezLb.charAt(1)));
            temp = rezRD - rezLa1 - rezLb1;
            if ((rezLa1 + rezLb1) % 10 != rezRD % 10) {
                System.out.println("В таком случае решения нет!");
            } else {
                rezLa0 = temp / 10 / 2;
                rezLb0 = temp /10 - rezLa0;
                System.out.println(rezLa0 + "" + rezLa1 + " + " + rezLb0 + "" + rezLb1 + " = " + rezRD);
            }
        } 

        if (indexLa == 0 && indexLb == 1) {
            rezLa1 = Integer.parseInt(Character.toString(rezLa.charAt(1)));
            rezLb0 = Integer.parseInt(Character.toString(rezLb.charAt(0)));
            temp = rezRD - rezLa1 - rezLb0 * 10;
            rezLa0 = temp / 10;
            rezLb1 = temp % 10;
            System.out.println(rezLa0 + "" + rezLa1 + " + " + rezLb0 + "" + rezLb1 + " = " + rezRD);
        }

        if (indexLa == 1 && indexLb == 0) {
            rezLa0 = Integer.parseInt(Character.toString(rezLa.charAt(0)));
            rezLb1 = Integer.parseInt(Character.toString(rezLb.charAt(1)));
            temp = rezRD - rezLa0 * 10 - rezLb1;
            rezLa1 = temp % 10;
            rezLb0 = temp / 10;
            System.out.println(rezLa0 + "" + rezLa1 + " + " + rezLb0 + "" + rezLb1 + " = " + rezRD);
        }

        if (indexLa == 1 && indexLb == 1) {
            rezLa0 = Integer.parseInt(Character.toString(rezLa.charAt(0)));
            rezLb0 = Integer.parseInt(Character.toString(rezLb.charAt(0)));
            temp = rezRD - rezLa0 * 10 - rezLb0 * 10;
            if (temp < 0 || temp > 18) {
                System.out.println("В таком случае решения нет!");
            } else {
                rezLa1 = temp / 2;
                rezLb1 = temp - rezLa1;
                System.out.println(rezLa0 + "" + rezLa1 + " + " + rezLb0 + "" + rezLb1 + " = " + rezRD);
            }
        }
    }
}
