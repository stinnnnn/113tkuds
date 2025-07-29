import java.util.*;
public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        Pair res = find(0, n - 1, v);
        System.out.println("SecondMax: " + res.second);
    }
    // 回傳 (max, second)
    static Pair find(int l, int r, int[] v) {
        if (l == r) return new Pair(v[l], Integer.MIN_VALUE);
        int m = (l + r) / 2;
        Pair L = find(l, m, v), R = find(m + 1, r, v);
        int mx = Math.max(L.max, R.max);
        int sec;
        if (L.max == R.max) {
            sec = Math.max(L.second, R.second);
        } else if (L.max > R.max) {
            sec = Math.max(L.second, R.max);
        } else {
            sec = Math.max(R.second, L.max);
        }
        return new Pair(mx, sec);
    }
    static class Pair {
        int max, second;
        Pair(int a, int b) { max = a; second = b; }
    }
}
/*
 * Time Complexity: O(n)
 * 說明：遞迴二分合併，每層合併花 O(1)，總共 O(n)。
 */
