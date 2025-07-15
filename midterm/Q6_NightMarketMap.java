import java.util.*;
public class Q6_NightMarketMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        char[][] map = new char[10][10];
        for (char[] row : map) Arrays.fill(row, '#');
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt(), c = sc.nextInt();
            if (r >= 0 && r < 10 && c >= 0 && c < 10) map[r][c] = '*';
        }
        for (char[] row : map) {
            for (char ch : row) System.out.print(ch);
            System.out.println();
        }
    }
}
