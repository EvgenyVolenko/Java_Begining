// Напишите метод, который сжимает строку. Пример: вход aaaabbbcddaaa.
// результат - a4b3cd2a3
// .charAt(i)
// stroka = "Привет"
// stroka1 = new String
// stroka1 = "Привет"
// stroka == stroka1 ----> False
// stroka.equals(stroka1) ------> True

package Seminar_2;

public class CW_Task_02 {
    public static void main(String[] args) {

        String str = "aaaabbbcddaaa";
        System.out.println(coding(str));

    }

    static StringBuilder coding(String str1) {
        StringBuilder codStr = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
            } else {
                codStr.append(str1.charAt(i));
                if (count != 1) {
                    codStr.append(count);
                    count = 1;
                } 
            }
        }
        codStr.append(str1.charAt(str1.length() - 1));
        if (count != 1) {
            codStr.append(count);
        } 
        return codStr;
    }
}
