// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package Seminar_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_03_HW {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> listD = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listD.add(rnd.nextInt(10));
        }
        System.out.println(listD);
        System.out.println("MAX: " + maxF(listD));
        System.out.println("MIN: " + minF(listD));
        System.out.println("MED: " + medF(listD));
    }

    static int maxF(ArrayList<Integer> listDigits) {
        int maxDigit = listDigits.get(0);
        for (int i = 1; i < listDigits.size(); i++) {
            if (listDigits.get(i) > maxDigit) {
                maxDigit = listDigits.get(i);
            }
        }
        return maxDigit;
    }

    static int minF(ArrayList<Integer> listDigits) {
        int minDigit = listDigits.get(0);
        for (int i = 1; i < listDigits.size(); i++) {
            if (listDigits.get(i) < minDigit) {
                minDigit = listDigits.get(i);
            }
        }
        return minDigit;
    }

    static double medF(ArrayList<Integer> listDigits) {
        double medDigit = 0;
        for (int i = 0; i < listDigits.size(); i++) {
            medDigit += Double.valueOf(listDigits.get(i));
        }
        return medDigit / Double.valueOf(listDigits.size());
    }
}