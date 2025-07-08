public class ArraySearcher {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int n : array) {
            if (n == target) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};
        
        int idx67 = findElement(arr, 67);
        System.out.println("搜尋 67 的結果：索引 = " + idx67);
        System.out.println("67 在陣列中出現次數 = " + countOccurrences(arr, 67));
        
        int idx100 = findElement(arr, 100);
        System.out.println("搜尋 100 的結果：索引 = " + idx100);
        System.out.println("100 在陣列中出現次數 = " + countOccurrences(arr, 100));
    }
}
