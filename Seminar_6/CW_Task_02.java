// 1. Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 100.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
// процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package Seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class CW_Task_02 {
    public static void main(String[] args) {
        int N = 100, min = 0, max = 130;
        int[] arr = fillArrRand(N, min, max);
        double proc = procSet(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(proc);
    }

    public static double procSet(int[] array) {
        HashSet hs = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            hs.add(array[i]);
        }
        double x = (hs.size() * 100.0) / array.length;
        return x;
    }

    public static int[] fillArrRand(int n, int min, int max) {
        Random rnd = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(min, max + 1);
        }
        return array;
    }
}
