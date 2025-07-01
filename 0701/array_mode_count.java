public class array_mode_count {

    public static void main(String[] args) {
        int[] data = {3, 7, 3, 1, 1, 1};
        int mode = data[0];
        int maxCount = 0;

        for (int i = 0; i < data.length; i++) {
            int count = 0;
            for (int j = 0; j < data.length; j++) {
                if (data[j] == data[i]) count++;
            }
            System.out.printf("比對中：%d 出現次數 = %d%n", data[i], count);

            if (count > maxCount) {
                maxCount = count;
                mode = data[i];
            }
        }
        System.out.printf("眾數為：%d，出現 %d 次%n", mode, maxCount);
    }
}
