// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package Seminar_4;

import java.util.LinkedList;

public class Task_01_HW {
    public static void main(String[] args) {
        LinkedList<Integer> listD = new LinkedList<>();
        for (int i = 0; i < 30; i++) {
            listD.add(i);
        }
        System.out.println(listD);
        System.out.println(revers1(listD));
        System.out.println(revers2(listD));
    }

    public static LinkedList<Integer> revers1(LinkedList<Integer> llD) {
        LinkedList<Integer> llDR = new LinkedList<>();
        
        for (int i = 0; i < llD.size(); i++) {
            llDR.addFirst(llD.get(i));
        }

        return llDR;
    }

    public static LinkedList<Integer> revers2(LinkedList<Integer> llD) {
        int temp = 0;
        for (int i = 0; i < llD.size() / 2; i++) {
            temp = llD.get(i);
            llD.set(i, llD.get(llD.size() -1 - i));
            llD.set((llD.size() -1 - i), temp);
        }
        return llD;
    }
}
