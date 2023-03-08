// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;

public class Task_01_HW {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] arr = new int[] {8, 4, 9, 1, 6, 5, 3, 2, 7};
        FileHandler fh = new FileHandler("log.txt");
        WriteToFile(arr);
        try {
            WriteToLog(arr, fh);
        } catch (IOException e) {
            System.out.println("Что то пошло не так");
        }
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr, fh);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] inputArray, FileHandler fhf) {
        int temp = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - 1 - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
            WriteToFile(inputArray);
            try {
                WriteToLog(inputArray, fhf);
            } catch (IOException e) {
                System.out.println("Что то пошло не так");
            }
        }
    }

    public static void WriteToFile(int[] array) {
        String file_name = "rezit.txt";
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(Arrays.toString(array));
            writer.write("\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }

    public static void WriteToLog(int[] array, FileHandler fhf) throws IOException {
    
        Logger logger = Logger.getLogger(Arrays.toString(array));
        logger.addHandler(fhf);
        SimpleFormatter sFormat = new SimpleFormatter();
        fhf.setFormatter(sFormat);
        logger.info(Arrays.toString(array));
    }

}