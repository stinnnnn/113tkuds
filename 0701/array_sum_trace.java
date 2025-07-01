public class array_sum_trace {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int total = 0;

        for (int value : arr) {
            int before = total;
            total += value;
            System.out.printf("加總過程：total = %d + %d = %d%n",
                              before, value, total);
        }
        System.out.printf("總和為：%d%n", total);
    }
}
