import java.util.*;
public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String[] p = s.split(":");
            times[i] = Integer.parseInt(p[0]) * 60 + Integer.parseInt(p[1]);
        }
        String q = sc.next();
        String[] pq = q.split(":");
        int qt = Integer.parseInt(pq[0]) * 60 + Integer.parseInt(pq[1]);
        // binary search first > qt
        int lo = 0, hi = n;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (times[mid] <= qt) lo = mid + 1;
            else hi = mid;
        }
        if (lo == n) {
            System.out.println("No bike");
        } else {
            int h = times[lo] / 60, m = times[lo] % 60;
            System.out.printf("%02d:%02d\n", h, m);
        }
    }
}
/*
 * Time Complexity: O(log n)
 * 說明：對已排序時間表使用二分搜尋，查詢時間複雜度 O(log n)。
 */
