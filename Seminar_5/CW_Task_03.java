// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: a+(1*3)] - ложь
// Пример 3: [6+(3*3)] - истина

package Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CW_Task_03 {
    public static void main(String[] args) {
        String str = "[6+(3*3)]";
        String str1 = "a+(1*3)]";
        System.out.println(checkF(str));
        System.out.println(checkF(str1));
    }

    public static boolean checkF(String s) {
        Map<Character, Character> db = new HashMap<>();
        db.put('[', ']');
        db.put('(', ')');

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (db.containsKey(c)) {
                st.add(c);
            }

            for (var entry : db.entrySet()) {
                if (c == entry.getValue()) {
                    if (!st.isEmpty() && st.peek() == entry.getKey()) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
