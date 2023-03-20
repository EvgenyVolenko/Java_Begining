// Даны 2 строки, написать метод, который вернет true, если эти
// строки являются изоморфными и false, если нет. Строки изоморфны,
// если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву
// с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// f b
// o a
// o --> a
// Output: false
// Пример 2:
// Input: s = "paper", t = "titee"
// p t
// a i
// e l
// r e
// Output: true

package Seminar_5;

import java.util.HashMap;

public class CW_Task_02 {
    public static void main(String[] args) {
        String word1 = "paprr", word2 = "titee";
        System.out.println(isomor(word1, word2));
    }

    public static boolean isomor(String w1, String w2) {
        HashMap<Character, Character> db = new HashMap<>();

        for (int i = 0; i < w1.length(); i++) {
            if (db.containsKey(w1.charAt(i))) {
                if (db.get(w1.charAt(i)).equals(w2.charAt(i)));
                else {
                    return false;
                }
            } else {
                db.putIfAbsent(w1.charAt(i), w2.charAt(i));
            }
        }

        HashMap<Character, Character> db1 = new HashMap<>();

        for (int i = 0; i < w1.length(); i++) {
            if (db1.containsKey(w2.charAt(i))) {
                if (db1.get(w2.charAt(i)).equals(w1.charAt(i)));
                else {
                    return false;
                }
            } else {
                db1.putIfAbsent(w2.charAt(i), w1.charAt(i));
            }
        }
        return true;
    }
}