import java.util.*;
public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] kWhs = new int[n];
        for (int i = 0; i < n; i++) kWhs[i] = sc.nextInt();
        int total = 0;
        for (int k : kWhs) {
            int bill = calc(k);
            total += bill;
            System.out.println("Bill: $" + bill);
        }
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + Math.round((double)total / n));
    }
    static int calc(int kWh) {
        int fee = 0;
        int[] bounds = {120, 210, 170, 200, 300, Integer.MAX_VALUE};
        double[] rates = {1.68, 2.45, 3.70, 5.04, 6.24, 8.46};
        for (int i = 0; i < bounds.length && kWh > 0; i++) {
            int used = Math.min(kWh, bounds[i]);
            fee += Math.round(used * rates[i]);
            kWh -= used;
        }
        return fee;
    }
}
/*
 * Time Complexity: O(n)
 * 說明：每個 kWh 計算最多跑 6 段，每段固定時間，總共跑 n 次 → O(n)
 */