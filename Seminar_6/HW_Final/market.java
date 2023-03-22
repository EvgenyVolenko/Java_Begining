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
import java.util.Scanner;

public class market {
    public static void main(String[] args) {
        notebook note1 = new notebook("ASUS", 16, 500, "Windows", "Белый");
        notebook note2 = new notebook("MSI", 8, 256, "Windows", "Серый");
        notebook note3 = new notebook("Apple", 8, 250, "iOS", "Черный");
        notebook note4 = new notebook("iRU", 4, 128, "Linux", "Серый");
        notebook note5 = new notebook("iRU", 32, 1000, "DOS", "Белый");

        HashSet<notebook> notebooks = new HashSet<>();
        notebooks.add(note1);
        notebooks.add(note2);
        notebooks.add(note3);
        notebooks.add(note4);
        notebooks.add(note5);

        texts.printHead();
        texts.printMenu();

        Scanner iScanner = new Scanner(System.in, "Cp866");
        texts.printReq();
        String text = iScanner.next();
        int nm, min, max;
        HashSet<String> temp = new HashSet<>();

        while (!text.equals("0")) {
            try {
                nm = Integer.parseInt(text);
                if (nm == 1) {
                    System.out.print("Введите минимальный объем ОЗУ: ");
                    min = iScanner.nextInt();
                    System.out.print("Введите максимальный объем ОЗУ: ");
                    max = iScanner.nextInt();
                    notebook.printMMOzu(notebooks, min, max);
                    texts.printMenu();
                } else if (nm == 2) {
                    System.out.print("Введите минимальный объем HDD: ");
                    min = iScanner.nextInt();
                    System.out.print("Введите максимальный объем HDD: ");
                    max = iScanner.nextInt();
                    notebook.printMMHdd(notebooks, min, max);
                    texts.printMenu();
                } else if (nm == 3) {
                    System.out.print("Доступные операционные системы: ");
                    for (notebook note : notebooks) {
                        temp.add(note.getOsTypey());
                    }
                    System.out.println(temp);
                    temp.clear();
                    System.out.print("Введите нужную: ");
                    text = iScanner.next();
                    notebook.printByOS(notebooks, text);
                    texts.printMenu();
                } else if (nm == 4) {
                    System.out.print("Доступные цвета: ");
                    for (notebook note : notebooks) {
                        temp.add(note.getColor());
                    }
                    System.out.println(temp);
                    temp.clear();
                    System.out.print("Введите нужный: ");
                    text = iScanner.next();
                    notebook.printByColor(notebooks, text);
                    texts.printMenu();
                } else if (nm == 5) {
                    notebook.printAll(notebooks);
                    texts.printMenu();
                } else if (nm == 6) {
                    System.out.println("Давайте запутаем остальных. Введите производителя, которого хотите заменить!");
                    for (notebook note : notebooks) {
                        temp.add(note.getManufacturer());
                    }
                    System.out.println("У нас есть: " + temp);
                    temp.clear();
                    System.out.print("Введите производителя для замены: ");
                    text = iScanner.next();
                    for (notebook note : notebooks) {
                        if(note.getManufacturer().equals(text)){
                            note.setManufacturer("Самый лучший!!!");
                        }
                    }
                    notebook.printAll(notebooks);
                    texts.printMenu();
                } else {
                    
                }
                
            } catch (Exception e) {
                System.out.println("Вы ввели, что-то не то!");
                texts.printMenu();
            }
            texts.printReq();
            text = iScanner.next();
        }
        iScanner.close();
    }
}
