import java.util.*;
public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long lcm = a / gcd(a, b) * b;
        System.out.println("LCM: " + lcm);
    }
    static long gcd(long x, long y) {
        if (x == y) return x;
        if (x > y) return gcd(x - y, y);
        else          return gcd(x, y - x);
    }
}
/*
 * Time Complexity: O(n)
 * 說明：輾轉相減法遞迴呼叫次數與數值大小最壞成正比，故約 O(n)。
 */
