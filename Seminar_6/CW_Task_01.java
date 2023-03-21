// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.

package Seminar_6;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CW_Task_01 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(30000);
        set.add(2);
        set.add(4);
        set.add(5000);
        set.add(6);
        set.add(3);
        System.out.println(set);

        LinkedHashSet<Integer> setL = new LinkedHashSet<>();
        setL.add(1);
        setL.add(2);
        setL.add(30000);
        setL.add(2);
        setL.add(4);
        setL.add(5000);
        setL.add(6);
        setL.add(3);
        System.out.println(setL);

        int[] arr = {1, 2, 30000, 2, 4, 5000, 6, 3};
        TreeSet<Integer> setT = new TreeSet(Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            setT.add(arr[i]);
        }
        System.out.println(setT);
    }
}
