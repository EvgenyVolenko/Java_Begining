// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

package Seminar_6.HW_Final;

import java.util.HashSet;

public class market {
    public static void main(String[] args) {
        notebook note1 = new notebook("ASUS", 16, 500, "Windows", "Белый");
        notebook note2 = new notebook("MSI", 8, 256, "Windows", "Серый");
        notebook note3 = new notebook("Apple", 8, 250, "iOS", "Черный");
        notebook note4 = new notebook("iRU", 4, 128, "Linux", "Серый");
        notebook note5 = new notebook("iRU", 3, 1000, "DOS", "Белый");

        HashSet<notebook> notebooks = new HashSet<>();
        notebooks.add(note1);
        notebooks.add(note2);
        notebooks.add(note3);
        notebooks.add(note4);
        notebooks.add(note5);

        texts.printHead();
        texts.printMenu();

        printAll(notebooks);
        System.out.println();

        note1.setManufacturer("ГРАНИТ");
        printAll(notebooks);
    }

    public static void printAll(HashSet<notebook> notebooks) {
        for (notebook note : notebooks) {
            System.out.println(note.toString());
        }
    }
}
