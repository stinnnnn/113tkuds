// 檔名：fibonacci.java
public class fibonacci {
    /**
     * 計算費波納契數列的第 n 項（定義 fibonacci(0)=0, fibonacci(1)=1）
     *
     * @param n 指定的項數
     * @return  第 n 項的值
     */
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(0));   // 0
        System.out.println(fibonacci(1));   // 1
        System.out.println(fibonacci(5));   // 5
        System.out.println(fibonacci(10));  // 55
    }
}

/*
 * Time Complexity: O(2^n)
 *   – 遞迴呼叫會不斷展開成兩個子問題，呼叫樹近似二元指數成長。
 */
