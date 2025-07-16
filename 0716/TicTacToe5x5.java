import java.util.Scanner;

public class TicTacToe5x5 {
    static final int SIZE = 5;
    static char[][] board = new char[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initBoard();
        System.out.println("=== 5x5 井字遊戲 ===");
        printBoard();

        char currentPlayer = 'X';
        while (true) {
            System.out.print("請玩家 " + currentPlayer + " 輸入 row col（例如 1 3）: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                System.out.println("座標超出範圍，請重新輸入！");
                continue;
            }

            if (board[row][col] != '.') {
                System.out.println("該位置已有棋子，請重新輸入！");
                continue;
            }

            board[row][col] = currentPlayer;
            System.out.println("玩家 " + currentPlayer + " 在位置 (" + row + ", " + col + ") 放置棋子");
            printBoard();

            if (checkWin(currentPlayer)) {
                System.out.println("玩家 " + currentPlayer + " 獲勝！");
                break;
            }

            if (isFull()) {
                System.out.println("平手！");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }

    static void initBoard() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = '.';
    }

    static void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean checkWin(char player) {
        // 橫列與直行
        for (int i = 0; i < SIZE; i++) {
            boolean rowWin = true, colWin = true;
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != player) rowWin = false;
                if (board[j][i] != player) colWin = false;
            }
            if (rowWin || colWin) return true;
        }

        // 主對角線
        boolean diag1 = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][i] != player) diag1 = false;
        }

        // 反對角線
        boolean diag2 = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][SIZE - 1 - i] != player) diag2 = false;
        }

        return diag1 || diag2;
    }

    static boolean isFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j] == '.')
                    return false;
        return true;
    }
}
