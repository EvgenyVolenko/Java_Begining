package Seminar_5;

public class Task_03_HW_01 {
    public static void printMatrix(char[][] board) {
        // 8x8 board
        int n = board.length;
        System.out.println("------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }

    public static void updateBoard(int row, int col, boolean[][] logicalBoard) {
        int n = logicalBoard.length;
        for (int j = 0; j < n; j++) {
            logicalBoard[row][j] = false;
        }
        for (int j = 0; j < n; j++) {
            logicalBoard[j][col] = false;
        }
        int r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            logicalBoard[r][c] = false;
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r < n && c < n) {
            logicalBoard[r][c] = false;
            r++;
            c++;
        }
        r = row;
        c = col;
        while (r < n && c >= 0) {
            logicalBoard[r][c] = false;
            r++;
            c--;
        }
        r = row;
        c = col;
        while (r >= 0 && c < n) {
            logicalBoard[r][c] = false;
            r--;
            c++;
        }
    }

    public static char[][] copyArray(char[][] original) {
        char[][] copy = new char[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }
        return copy;
    }

    public static boolean[][] copyArray(boolean[][] original) {
        boolean[][] copy = new boolean[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }
        return copy;
    }

    public static void arrangeQueens1(char[][] board, boolean[][] logicalBoard, int rowNumber) {
        if (rowNumber == 8) {
            printMatrix(board);
            return;
        }

        int n = board.length;
        for (int column = 0; column < n; column++) {
            if (logicalBoard[rowNumber][column]) {
                char[][] newBoard = copyArray(board);
                boolean[][] newLogicalBoard = copyArray(logicalBoard);
                newBoard[rowNumber][column] = 'X';
                newLogicalBoard[rowNumber][column] = false;
                updateBoard(rowNumber, column, newLogicalBoard);
                arrangeQueens1(newBoard, newLogicalBoard, rowNumber + 1);
            }
        }
    }

    public static void arrangeQueens() {
        int N = 8;
        char[][] board = new char[N][N];
        boolean[][] logicalBoard = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '0';
                logicalBoard[i][j] = true;
            }
        }
        arrangeQueens1(board, logicalBoard, 0);
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        arrangeQueens();
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Время выполнения, мс " + estimatedTime);
    }
}
