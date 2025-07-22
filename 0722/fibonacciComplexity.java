// 檔名：fibonacciComplexity.java
public class fibonacciComplexity {
    /**
     * 標準遞迴版本 - 效率很差
     * Time Complexity: O(2^n)  - 指數級成長
     * Space Complexity: O(n)  - 遞迴呼叫棧深度
     */
    public static int fibonacciSlow(int n) {
        if (n <= 1) return n;
        return fibonacciSlow(n - 1) + fibonacciSlow(n - 2);
    }

    /**
     * 記憶化版本 - 效率很好
     * Time Complexity: O(n)    - 每個 n 只計算一次
     * Space Complexity: O(n)   - 儲存計算結果 + 遞迴呼叫棧
     */
    public static int fibonacciFast(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciFast(n - 1, memo) + fibonacciFast(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 30;

        // 測量標準遞迴版
        long startSlow = System.nanoTime();
        int resultSlow = fibonacciSlow(n);
        long timeSlow = System.nanoTime() - startSlow;
        System.out.printf("Slow Fibonacci(%d) = %d, time = %.3f ms%n",
                          n, resultSlow, timeSlow / 1_000_000.0);

        // 測量記憶化版本
        int[] memo = new int[n + 1];
        long startFast = System.nanoTime();
        int resultFast = fibonacciFast(n, memo);
        long timeFast = System.nanoTime() - startFast;
        System.out.printf("Fast Fibonacci(%d) = %d, time = %.3f ms%n",
                          n, resultFast, timeFast / 1_000_000.0);
    }
}
