// Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// информационной системой ветеринарной клиники
// Поля:
// Имя
// Возраст
// Привит

// Методы
// Кот {} мяукнул {} раз
// Прививка

package Seminar_6;

import java.util.Random;

public class CW_Task_03 {
    public static void main(String[] args) {
        CW_Task_03_CAT cat1 = new CW_Task_03_CAT();
        cat1.Name = "Васька";
        cat1.age = 3;
        cat1.vakcina = true;
         
        CW_Task_03_CAT cat2 = new CW_Task_03_CAT();
        cat2.Name = "Рыжий";
        cat2.age = 7;
        cat2.vakcina = false;

        myau(cat1);
        myau(cat2);

        vakcined(cat1);
        vakcined(cat2);
    }

    public static void myau(CW_Task_03_CAT cat) {
        Random rnd = new Random();
        System.out.printf("Кот %s мяукнул %d раз.\n", cat.Name, rnd.nextInt(10));
    }

    public static void vakcined(CW_Task_03_CAT cat) {
        if (cat.vakcina) {
            System.out.printf("Кот %s вакцинирован.\n", cat.Name);
        } else {
            System.out.printf("Кот %s НЕ вакцинирован.\n", cat.Name);
        }
    }
}
