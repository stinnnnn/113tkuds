import java.util.*;
public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        for (int i = 0; i < n; i++) times[i] = toMinutes(sc.nextLine());
        int query = toMinutes(sc.nextLine());
        int idx = Arrays.binarySearch(times, query + 1);
        if (idx < 0) idx = -idx - 1;
        if (idx >= n) System.out.println("No train");
        else System.out.println(toTime(times[idx]));
    }
    static int toMinutes(String t) {
        String[] parts = t.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
    static String toTime(int m) {
        return String.format("%02d:%02d", m / 60, m % 60);
    }
}
/*
 * Time Complexity: O(log n)
 * 說明：使用 Arrays.binarySearch 執行二分搜尋，時間複雜度為 O(log n)
 */
