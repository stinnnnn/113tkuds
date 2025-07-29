import java.util.*;
public class F08_ClimbStairsMemo {
    static long[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new long[n + 1];
        System.out.println("Ways: " + ways(n));
    }
    static long ways(int k) {
        if (k < 0) return 0;
        if (k == 0) return 1;
        if (memo[k] != 0) return memo[k];
        return memo[k] = ways(k-1) + ways(k-2) + ways(k-3);
    }
}
