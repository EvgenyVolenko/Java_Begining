// Записать слово TEST в файл 10 раз

package Seminar_2;

import java.io.File;
import java.io.FileWriter;

public class CW_Task_03 {
    public static void main(String[] args) {
        int n = 10;
        String text = "TEST";
        String file_name = "test.txt";
        File file = new File(file_name);
        try{
            FileWriter writer = new FileWriter(file,false);
            for (int i = 0; i < n; i++){
            writer.write(text);
            writer.write("\n");
            }
            writer.close();
            System.out.println("Получилось!)");
            }
            catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    }
}
