// 檔名：digitSum.java
public class digitSum {
    /**
     * 計算正整數 n 的各位數字總和
     *
     * @param n 正整數
     * @return 各位數字相加的結果
     */
    public static int digitSum(int n) {
        // 終止條件：當 n 小於 10，直接回傳 n 本身
        if (n < 10) {
            return n;
        }
        // 遞迴步驟：取出最低位數 (n % 10)，加上剩餘位數之和
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(12345)); // 15
        System.out.println(digitSum(7));     // 7
        System.out.println(digitSum(9876));  // 30
    }
}

/*
 * Time Complexity: O(d) = O(log n)
 *   – d 為 n 的位數，每次遞迴 n 都會除以 10，最多需呼叫 d 次。
 */
