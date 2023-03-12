// Создать список типа ArrayList. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package Seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class CW_Task_03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        Random rnd = new Random();
        String[] planets = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        list.add(rnd.nextInt(10));
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(10));
            list.add(planets[rnd.nextInt(planets.length)]);
        }
        System.out.println(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                // i--;
            }
        }
        System.out.println(list);
    }
}
