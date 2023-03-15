// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_02_HW {
    public static void main(String[] args) {
        LinkedList<Integer> listD = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in, "Cp866");
        fillLL(listD);
        System.out.println(listD);
        menu();
        String text = iScanner.next();
        int nm = Integer.parseInt(text);
        while (true) {
            if (nm == 1) {
                text = iScanner.next();
                enqueue(text, listD);
            } else if (nm == 2) {
                dequeue(listD);
            } else if (nm == 3) {
                first(listD);
            } else {
                System.out.println("Ввели что-то не то!");
            }
            System.out.println(listD);
            text = iScanner.next();
            nm = Integer.parseInt(text);
        }
    }

    public static void enqueue(String txt, LinkedList<Integer> llD) {
        int nm = Integer.parseInt(txt);
        llD.add(nm);
    }

    public static void dequeue(LinkedList<Integer> llD) {
        System.out.println("Будет удален перый элемент " + llD.getFirst());
        llD.removeFirst();
    }

    public static void first(LinkedList<Integer> llD) {
        System.out.println("Первый элемент очереди " + llD.getFirst());
    }

    public static LinkedList<Integer> fillLL(LinkedList<Integer> llD) {
        for (int i = 0; i < 30; i++) {
            llD.add(i);
        }
        return llD;
    }

    public static void menu() {
        System.out.print("Для помещения элемента в конец очереди введите 1\n"
                + "Для возвращения первого элемента из очереди и удаления его введите 2\n"
                + "Для возвращения первого элемента из очереди без удаления введите 3\n"
                + "Введите число: ");
    }
}
