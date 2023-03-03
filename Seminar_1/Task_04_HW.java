// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

package Seminar_1;

// import java.util.Scanner;

public class Task_04_HW {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in, "Cp866");
        // System.out.printf("Введите выражение: ");
        // String name = iScanner.nextLine();
        // iScanner.close();
        String name = "2? + ?5 = 69";
        name = name.replaceAll("\\s", "");
        String[] parts = name.split("=");
        String rezR = parts[1];
        String rezL = parts[0];
        parts = rezL.split("\\+");
        String rezLa = parts[0];
        String rezLb = parts[1];
        int indexLa = rezLa.indexOf('?');

        int indexLb = rezLb.indexOf('?');
        System.out.println(rezLa + " + " + rezLb + " = " + rezR + " indLa = " + indexLa + " indLb = " + indexLb);
    }
}
