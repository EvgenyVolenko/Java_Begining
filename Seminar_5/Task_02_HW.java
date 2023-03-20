// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package Seminar_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Task_02_HW {
    public static void main(String[] args) {
        String file_name = "workers.txt";
        HashMap<String, String> dbWorkers = fileToMap(file_name);
        System.out.println(nameCount(dbWorkers));
        sortByCount(nameCount(dbWorkers));
    }

    public static void sortByCount(HashMap<String, Integer> hmS) {
        
        ArrayList<Integer> countName = new ArrayList<>();
        for (var item : hmS.entrySet()) {
            if (!countName.contains(item.getValue())) {
                countName.add(item.getValue());
            }
        }
        countName.sort(Comparator.naturalOrder());
                
        for (int i = countName.size() - 1; i >= 0; i--) {
            for (var item : hmS.entrySet()) {
                if (countName.get(i) == item.getValue()) {
                    System.out.println(item.getValue() + " " + item.getKey());
                }
            }
        }
    }

    public static HashMap<String, Integer> nameCount(HashMap<String, String> dbW) {
        int i = 0;
        String[] temp = new String[dbW.size()];
        for (var item : dbW.entrySet()) {
            temp[i] = item.getValue();
            i++;
        }
        Arrays.sort(temp);
        int count = 1;
        HashMap<String, Integer> tMap = new HashMap<>();
        for (i = 0; i < temp.length - 1; i++) {
            if (temp[i].equals(temp[i + 1])) {
                count++;
            } else {
                tMap.put(temp[i], count);
                count = 1;
            }
        }
        tMap.put(temp[temp.length - 1], count);
        return tMap;
    }

    public static HashMap<String, String> fileToMap(String file_n) {
        File file = new File(file_n);
        HashMap<String, String> db = new HashMap<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                db.put(strparse(line)[1], strparse(line)[0]);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
        return db;
    }

    public static String[] strparse(String str) {
        String[] parts = str.split(" ");
        return parts;
    }
}
