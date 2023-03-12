// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class CW_Task_02 {
    public static void main(String[] args) {
        String[] planets = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        Random rnd = new Random();
        ArrayList<String> listP = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listP.add(i, planets[rnd.nextInt(planets.length)]);
        }
        System.out.println(listP);
        int[] countPlanet = new int[planets.length];
        for (String name : listP) {
            for (int i = 0; i < planets.length; i++) {
                if (name.equals(planets[i])) {
                    countPlanet[i]++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(countPlanet));

        for (int i = 0; i < countPlanet.length; i++) {
            System.out.println(planets[i] + ": " + countPlanet[i]);
        }

        planetSystemIter();

        listP.sort(Comparator.naturalOrder());
        System.out.println(listP);
        int count = 1;
        for (int i = 0; i < listP.size() - 1; i++) {
            if (listP.get(i + 1).equals(listP.get(i))) count++;
            else {
                System.out.println(listP.get(i) + " повторяется " + count + " раз.");
                count = 1;
            }
        }
        System.out.println(listP.get(listP.size() - 1) + " повторяется " + count + " раз.");
    }

    static void planetSystemIter() {
        String[] solarSystem1 = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
        ArrayList<String> solarSystemRes = new ArrayList<String>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            solarSystemRes.add(solarSystem1[rnd.nextInt(0, 7)]);
        }
        System.out.println(solarSystemRes);
        for (int i = 0; i < solarSystem1.length; i++) {
            System.out.printf("%s встречается %d раз \n", solarSystem1[i],
                    Collections.frequency(solarSystemRes, solarSystem1[i]));
        }
    }
}
