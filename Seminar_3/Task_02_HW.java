// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_02_HW {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> listD = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listD.add(rnd.nextInt(10));
        }
        System.out.println(listD);
        
        for (int i = listD.size() - 1; i >= 0; i--) {
            if (listD.get(i) % 2 == 0) {
                listD.remove(i);
            }
        }
        System.out.println(listD);
    }
}
