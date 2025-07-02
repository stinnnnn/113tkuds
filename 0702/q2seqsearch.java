import java.util.*;

public class q2seqsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int key = sc.nextInt();

        int ops = 0;                       
        boolean found = false;
        for (int x : a) {
            ops++;                         
            if (x == key) { found = true; break; }
        }

        System.out.println(found ? "Yes" : "No");
        System.out.println(ops);
    }
}
