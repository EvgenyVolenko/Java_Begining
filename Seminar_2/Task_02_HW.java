// Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Seminar_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task_02_HW {
    public static void main(String[] args) {
        String file_name = "bd.txt";
        File file = new File(file_name);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String rezZn = "";
            String[] pole = {"Студент ", " получил ", " по предмету "};
            StringBuilder rez = new StringBuilder();
            String line = reader.readLine();

            while (line != null) {
                line = line.replaceAll("\"", "");
                for (int i = 0; i < strparse(line).length; i++) {
                    rezZn = strparsekey(strparse(line)[i])[1];
                    rez.append(pole[i]).append(rezZn);
                }
                System.out.println(rez.append("."));
                rez.setLength(0);
                line = reader.readLine();                         
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }

    public static String[] strparse(String str){
        String[] parts = str.split(",");
        return parts;
    }

    public static String[] strparsekey(String strkey){
        String[] partskey = strkey.split(":");
        return partskey;
    }
}
