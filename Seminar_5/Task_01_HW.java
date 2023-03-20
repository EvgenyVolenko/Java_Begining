// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

package Seminar_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task_01_HW {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> teleDB = new HashMap<>();
        Scanner iScanner = new Scanner(System.in, "Cp866");
        menu();
        String text = iScanner.next();
        int nm = Integer.parseInt(text);
        while (nm != 0) {
            if (nm == 1) {
                addNumber(teleDB);
                menu();
            } else if (nm == 2) {
                showAll(teleDB);
                menu();
            } else {
                System.out.println("Ввели что-то не то!");
            }
        
            text = iScanner.next();
            nm = Integer.parseInt(text);
        }
        iScanner.close();
    }

    public static void showAll(HashMap<String, ArrayList<Integer>> tDB) {
        StringBuilder numbers = new StringBuilder();
        for (var item : tDB.entrySet()) {
            for (int i = 0; i < item.getValue().size(); i++) {
                if (i != item.getValue().size() - 1) {
                    numbers.append(item.getValue().get(i)).append(", ");
                } else {
                    numbers.append(item.getValue().get(i));
                }
            }
            System.out.println(item.getKey() + ": " + numbers);
            numbers.setLength(0);
        }
    }

    public static void addNumber(HashMap<String, ArrayList<Integer>> tDB) {
        ArrayList<Integer> teleS = new ArrayList<>();
        System.out.print("Введите Фамилию: ");
        Scanner iScanner = new Scanner(System.in, "Cp866");
        String lastName = iScanner.next();
        System.out.print("Введите номер телефона: ");
        int telNumber = iScanner.nextInt();
        for (var item : tDB.entrySet()) {
            if (lastName.equals(item.getKey())){
                teleS = item.getValue();
            }
        }
        teleS.add(telNumber);
        tDB.putIfAbsent(lastName, teleS);
    }

    public static void menu() {
        System.out.print("Для добавления номера введите \"1\"\n"
                + "Для вывода всей телефонной книги введите \"2\"\n"
                + "Для выхода введите \"0\"\n"
                + "Введите число: ");
    }
}
