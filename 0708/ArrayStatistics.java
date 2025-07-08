public class ArrayStatistics {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};
        
        int sum = 0;
        for (int n : arr) sum += n;
        double avg = sum / (double) arr.length;
        
        int max = arr[0], min = arr[0];
        int maxIdx = 0, minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
        }
        
        int countAbove = 0, evenCount = 0, oddCount = 0;
        for (int n : arr) {
            if (n > avg) countAbove++;
            if (n % 2 == 0) evenCount++;
            else oddCount++;
        }
                
        System.out.println("=== 陣列統計結果 ===");
        System.out.printf("%-20s %10s%n", "項目", "數值");
        System.out.printf("%-20s %10d%n", "總和", sum);
        System.out.printf("%-20s %10.2f%n", "平均值", avg);
        System.out.printf("%-20s %10d (索引 %d)%n", "最大值", max, maxIdx);
        System.out.printf("%-20s %10d (索引 %d)%n", "最小值", min, minIdx);
        System.out.printf("%-20s %10d%n", "大於平均值的數量", countAbove);
        System.out.printf("%-20s %10d%n", "偶數個數", evenCount);
        System.out.printf("%-20s %10d%n", "奇數個數", oddCount);
    }
}
