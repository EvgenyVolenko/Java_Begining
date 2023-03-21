// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

package Seminar_5;

public class Task_03_HW_03 {
    public static void main(String[] args) {
        int N = 8;
        int count = 0, countall = 0;
        int[] ferzi = new int[N];
        String[][] ferziBoard = new String[N][N];
        String fillChar = "0", ferzChar = "X";

        long startTime = System.currentTimeMillis();
        
        for (int z = 0; z < ferzi.length; z++) {
            ferzi[0] = z;
            for (int k = 0; k < ferzi.length; k++) {
                ferzi[1] = k;
                for (int i = 0; i < ferzi.length; i++) {
                    ferzi[2] = i;
                    for (int j = 0; j < ferzi.length; j++) {
                        ferzi[3] = j;
                        for (int j2 = 0; j2 < ferzi.length; j2++) {
                            ferzi[4] = j2;
                            for (int l = 0; l < ferzi.length; l++) {
                                ferzi[5] = l;
                                for (int l2 = 0; l2 < ferzi.length; l2++) {
                                    ferzi[6] = l2;
                                    for (int index = 0; index < ferzi.length; index++) {
                                        ferzi[7] = index;
                                        if (checkFerzi(ferzi, ferziBoard, ferzChar)) {
                                            printCHBoard(ferziBoard);
                                            System.out.println();
                                            count++;
                                        }
                                        countall++;
                                        fillChBoard(ferziBoard, fillChar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Время выполнения, мс " + estimatedTime);
        System.out.println("Всего решений - " + count + " а переборов - " + countall);
    }

    public static boolean checkFerzi(int[] ferzi, String[][] ferziBoard, String ferzc) {
        fillChFerzi(ferzi, ferziBoard, ferzc);
        for (int i = 0; i < ferzi.length; i++) {
            if (!tempCol(ferziBoard, i, ferzi[i], ferzc) || !tempDiagR(ferziBoard, i, ferzi[i], ferzc)
                    || !tempDiagL(ferziBoard, i, ferzi[i], ferzc)) {
                return false;
            }
        }
        return true;
    }

    public static boolean tempCol(String[][] ferziB, int raw, int col, String ferzC) {
        for (int i = 0; i < ferziB.length; i++) {
            if (ferziB[i][col].equals(ferzC) && i != raw) {
                return false;
            }
        }
        return true;
    }

    public static boolean tempDiagR(String[][] ferziB, int raw, int col, String ferzC) {
        int y = raw - col;
        for (int i = 0; i < ferziB.length; i++) {
            for (int j = 0; j < ferziB.length; j++) {
                if (i - j == y && i != raw && j != col && ferziB[i][j].equals(ferzC)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean tempDiagL(String[][] ferziB, int raw, int col, String ferzC) {
        int x = raw + col;
        for (int i = 0; i < ferziB.length; i++) {
            for (int j = 0; j < ferziB.length; j++) {
                if (i + j == x && i != raw && j != col && ferziB[i][j].equals(ferzC)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void fillChFerzi(int[] ferzi, String[][] ferziBoard, String ferzC) {
        for (int i = 0; i < ferzi.length; i++) {
            ferziBoard[i][ferzi[i]] = ferzC;
        }
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
