package Seminar_5;

public class Task_03_HW_02 {
    public static void main(String[] args) {
        int N = 8;
        String[][] mat = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = "0";
            }
        }
        nQueen(mat, 0);
    }

    private static void nQueen(String[][] mat, int r) {
        if (r == mat.length) {
            printSolution(mat);
            return;
        }
        for (int i = 0; i < mat.length; i++) {
            if (isSafe(mat, r, i)) {
                mat[r][i] = "X";
                nQueen(mat, r + 1);
                mat[r][i] = "0";
            }
        }
    }

    private static boolean isSafe(String[][] mat, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (mat[i][c] == "X") {
                return false;
            }
        }
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == "X") {
                return false;
            }
        }
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
