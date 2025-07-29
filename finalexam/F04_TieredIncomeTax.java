import java.util.*;
public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double[] taxes = new double[n];
        for (int i = 0; i < n; i++) {
            double inc = sc.nextDouble();
            taxes[i] = calcTax(inc);
            sum += taxes[i];
        }
        for (double t : taxes) {
            System.out.printf("Tax: $%.0f%n", t);
        }
        System.out.printf("Average: $%.0f%n", sum / n);
    }
    static double calcTax(double x) {
        double tax = 0;
        double[][] bracket = {
            {0, 600000, 0.05},
            {600000, 1200000, 0.12},
            {1200000, 2420000, 0.20},
            {2420000, 4530000, 0.30},
            {4530000, Double.MAX_VALUE, 0.40}
        };
        for (double[] b : bracket) {
            double lo = b[0], hi = b[1], r = b[2];
            if (x > lo) {
                double amt = Math.min(x, hi) - lo;
                tax += amt * r;
            } else break;
        }
        return tax;
    }
}
/*
 * Time Complexity: O(n)
 * 說明：對每筆收入一次走訪五個稅率區間，整體 O(n)。
 */
