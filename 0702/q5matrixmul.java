import java.util.*;

public class q5matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] A = new long[n][n];
        long[][] B = new long[n][n];
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextLong();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                B[i][j] = sc.nextLong();

        long ops = 0;                       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                    ops++;                 
                }
                C[i][j] = sum;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) System.out.print(' ');
                System.out.print(C[i][j]);
            }
            System.out.println();
        }
        System.out.println(ops);
    }
}
