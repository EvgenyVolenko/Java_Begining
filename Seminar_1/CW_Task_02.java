// Дан массив двоичных чисел, например [1,1,0,1,1,1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.
// Вывод: 4

package Seminar_1;

public class CW_Task_02 {
    public static void main(String[] args) {
        int max = 0;
        int count = 0;
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > max)
                    max = count;
                count = 0;
            }
            if (count > max) max = count;
        }
        System.out.printf("Максимальное количество подряд идущих 1 = %d!", max);
    }
}
