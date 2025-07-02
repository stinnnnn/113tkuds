import java.util.*;

public class q3binsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int key = sc.nextInt();

        int left = 0, right = n - 1, ops = 0;
        int idx = -1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            ops++;                          
            if (a[mid] == key) { idx = mid; break; }
            else if (a[mid] < key)  left  = mid + 1;
            else                    right = mid - 1;
        }

        System.out.println(idx);
        System.out.println(ops);
    }
}
