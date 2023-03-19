// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000
//    1 2 3 4 5 6 7 8
// 1  X 0 0 0 0 0 0 0
// 2  0 0 X 0 0 0 0 0
// 3  0 0 0 0 0 0 0 0
// 4  0 0 0 0 0 0 0 0
// 5  0 0 0 0 0 0 0 0
// 6  0 0 0 0 0 0 0 0
// 7  0 0 0 0 0 0 0 0
// 8  0 0 0 0 0 0 0 0

package Seminar_5;

public class Task_03_HW {
    public static void main(String[] args) {
        int size = 8;
        String[][] chBoard = new String[size][size];
        String fillChar = "0", ferzChar = "X";
        fillChBoard(chBoard, fillChar);
        fillChBoardFerz(chBoard, ferzChar);
        printCHBoard(chBoard);
    }

    public static void fillChBoardFerz(String[][] chB, String ferzC) {
        int str = 0, raw = 0;
        String tempRaw = "", tempStr = "", tempDiagL = "", tempDiagR = "";
        chB[str][raw] = ferzC;
        for (int i = 0; i < chB.length; i++) {
            tempStr = strList(chB, i, tempStr);
            for (int j = 0; j < chB[0].length; j++) {
                tempRaw = rawList(chB, j, tempRaw);
                tempDiagR = tempDiagRList(chB, i, j, tempDiagR);
                tempDiagL = tempDiagLList(chB, i, j, tempDiagL);
                System.out.println("str " + i + " " + tempStr);
                System.out.println("raw " + j + " " + tempRaw);
                System.out.println("DiR " + tempDiagR);
                System.out.println("DiL " + tempDiagL);
                if (!tempRaw.contains(ferzC) && !tempStr.contains(ferzC) && !tempDiagR.contains(ferzC) && !tempDiagL.contains(ferzC)) {
                    chB[i][j] = ferzC;
                } 
                tempRaw = "";
                tempDiagR = "";
                tempDiagL = "";
            }
            tempStr = "";
            System.out.println();
        }
    }

    public static String tempDiagLList(String[][] chB, int str, int raw, String txt) {
        int x = str + raw;
        for (int i = 0; i < chB.length; i++) {
            for (int j = 0; j < chB.length; j++) {
                if (i + j == x) {
                    txt += chB[i][j];
                }
            }
        }
        return txt;
    }

    public static String tempDiagRList(String[][] chB, int str, int raw, String txt) {
        int y = str - raw;
        for (int i = 0; i < chB.length; i++) {
            for (int j = 0; j < chB.length; j++) {
                if (i - j == y) {
                    txt += chB[i][j];
                }
            }
        }
        return txt;
    }

    public static String rawList(String[][] chB, int raw, String txt) {
        for (int i = 0; i < chB.length; i++) {
            txt += chB[i][raw];
        }
        return txt;
    }

    public static String strList(String[][] chB, int str, String txt) {
        for (int i = 0; i < chB.length; i++) {
            txt += chB[str][i];
        }
        return txt;
    }

    public static void fillChBoard(String[][] chB, String fillch) {
        for (int i = 0; i < chB.length; i++) {
            for (int j = 0; j < chB[0].length; j++) {
                chB[i][j] = fillch;
            }
        }
    }

    public static void printCHBoard(String[][] chB) {
        for (int i = 0; i < chB.length; i++) {
            for (int j = 0; j < chB[0].length; j++) {
                System.out.print(chB[i][j] + ' ');
            }
            System.out.println();
        }
    }
}
