// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. 
//    Сравните с предыдущим.

package Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class CW_Task_01 {
    public static void main(String[] args) {
        int count = 500000;

        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        long timeS = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            al.add(0, i);
        }

        long timeM = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            ll.add(0, i);
        }

        long timeE = System.currentTimeMillis();

        int rez1 = (int)(timeM - timeS);
        int rez2 = (int)(timeE - timeM);

        System.out.println("ArrayList " + rez1 + " мс");
        System.out.println("LinkedList " + rez2 + " мс");
    }
}
