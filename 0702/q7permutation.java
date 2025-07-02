import java.util.*;

public class q7permutation {
    static long ops = 0;

    static void permute(int[] arr, int l, int r) {
        if (l == r) {
            for (int i = 0; i <= r; i++) {
                if (i > 0) System.out.print(' ');
                System.out.print(arr[i]);
            }
            System.out.println();
            ops++;                         
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, r);
            swap(arr, l, i);               
        }
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        permute(arr, 0, n - 1);
        System.out.println(ops);           
    }
}
