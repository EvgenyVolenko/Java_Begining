package Seminar_5;

public class Task_03_HW_02 {
    public static void main(String[] args) {
        // Шахматная доска `N × N`
        int N = 8;
        // `mat[][]` отслеживает положение дам в
        // текущая конфигурация
        String[][] mat = new String[N][N];
        // инициализируем `mat[][]` с помощью `-`
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = "0";
            }
        }
        nQueen(mat, 0);
    }

    private static void nQueen(String[][] mat, int r) {
        // если `N` ферзей расставлены успешно, выводим решение
        if (r == mat.length) {
            printSolution(mat);
            return;
        }
        // помещаем ферзя на каждую клетку в текущем ряду `r`
        // и повторяться для каждого допустимого движения
        for (int i = 0; i < mat.length; i++) {
            // если никакие два ферзя не угрожают друг другу
            if (isSafe(mat, r, i)) {
                // ставим ферзя на текущую клетку
                mat[r][i] = "X";
                // повторить для следующей строки
                nQueen(mat, r + 1);
                // возвращаемся назад и удаляем ферзя с текущей клетки
                mat[r][i] = "0";
            }
        }
    }

    private static boolean isSafe(String[][] mat, int r, int c) {
        // возвращаем false, если два ферзя делят один и тот же столбец
        for (int i = 0; i < r; i++) {
            if (mat[i][c] == "X") {
                return false;
            }
        }
        // вернуть false, если два ферзя делят одну и ту же диагональ `\`
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == "X") {
                return false;
            }
        }
        // вернуть false, если два ферзя делят одну и ту же диагональ `/`
        for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
            if (mat[i][j] == "X") {
                return false;
            }
        }
        return true;
    }

    private static void printSolution(String[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + ' ');
            }
            System.out.println();
        }
        System.out.println();
    }
}
