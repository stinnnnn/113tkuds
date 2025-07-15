import java.util.*;
public class Q7_DailyPowerReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < 7 / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[6 - i];
            arr[6 - i] = tmp;
        }
        for (int val : arr) System.out.print(val + " ");
    }
}