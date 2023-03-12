// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

package Seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class CW_Task_01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> listD = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listD.add(rnd.nextInt(10));
        }
        System.out.println(listD);
        listD.sort(Comparator.naturalOrder());
        System.out.println(listD);
    }
}
