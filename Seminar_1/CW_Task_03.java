// Дан массив nums = [3,2,2,3,4,3] и число val вводим с клавиатуры
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
// Ввод: 3
// Вывод:
// 2, 2, 4, 3, 3, 3

package Seminar_1;

import java.util.Scanner;

public class CW_Task_03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int temp = 0;
        int[] arr = new int[] { 3, 3, 2, 2, 3, 4, 3, 2 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                for (int j = i; j < arr.length - 1; j++) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
    }
}