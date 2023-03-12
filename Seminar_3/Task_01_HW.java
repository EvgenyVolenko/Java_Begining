// (Дополнительное) Реализовать алгоритм сортировки слиянием

package Seminar_3;

import java.util.Arrays;
import java.util.Random;

public class Task_01_HW {
    public static void main(String[] args) {
        Random rnd = new Random();
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        array = arrDrob(array);
    }

    static int[] arrDrob(int[] arr) {

        if (arr.length == 1) return arr;

        int[] arrL = new int[arr.length / 2];
        int[] arrR = new int[arr.length - arr.length / 2];
        for (int i = 0; i < arrL.length; i++) {
            arrL[i] = arr[i];
        }
        for (int i = 0; i < arrR.length; i++) {
            arrR[i] = arr[i + arrL.length];
        }
        arrL = arrDrob(arrL);
        arrR = arrDrob(arrR);
        System.out.println(Arrays.toString(arrSlit(arrL, arrR)));
        return arrSlit(arrL, arrR);

    }

    static int[] arrSlit(int[] arrayL, int[] arrayR) {
        int startL = 0, startR = 0;
        int[] arrRez = new int[arrayL.length + arrayR.length];
        for (int i = 0; i < arrRez.length; i++) {

            if (startL == arrayL.length) {
                arrRez[i] = arrayR[startR];
                startR++;
            } else if (startR == arrayR.length) {
                arrRez[i] = arrayL[startL];
                startL++;
            } else if (arrayL[startL] < arrayR[startR]) {
                arrRez[i] = arrayL[startL];
                startL++;
            } else {
                arrRez[i] = arrayR[startR];
                startR++;
            }
        }
        return arrRez;
    }
}
