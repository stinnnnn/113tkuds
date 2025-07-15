import java.util.*;
public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) result[i] = sc.nextInt();
        int k = sc.nextInt();
        int[] prefix = new int[k];
        prefix[0] = result[0];
        for (int i = 1; i < k; i++) prefix[i] = prefix[i-1] + result[i];
        System.out.print("PrefixSum:");
        for (int i = 0; i < k; i++) System.out.print(" " + prefix[i]);
    }
}
/*
 * Time Complexity: O(n)
 * 說明：建立 prefix 陣列走訪 k 次，加總時間為 O(k)，加上輸入為 O(n)
 */