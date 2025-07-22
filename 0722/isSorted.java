// 檔名：isSorted.java
public class isSorted {
    /**
     * 檢查陣列 arr 從 index 開始到末尾是否為升序排列
     *
     * @param arr   要檢查的整數陣列
     * @param index 從哪個位置開始檢查
     * @return      若從 index 起到陣列末端皆為升序，回傳 true；否則回傳 false
     */
    public static boolean isSorted(int[] arr, int index) {
        // 若陣列為 null 或長度 ≤ 1，一定視為已排序
        if (arr == null || arr.length <= 1) {
            return true;
        }
        // 若已檢查到最後一個元素，代表都沒發現錯誤
        if (index >= arr.length - 1) {
            return true;
        }
        // 若當前元素大於下一個元素，非升序
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // 否則往下一個位置遞迴檢查
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] sortedArr   = {1, 2, 2, 3, 5, 8};
        int[] unsortedArr = {1, 3, 2, 4, 5};

        System.out.println(isSorted(sortedArr,   0)); // true
        System.out.println(isSorted(unsortedArr, 0)); // false
    }
}

/*
 * Time Complexity: O(n)
 *   – 最壞情況需檢查整個陣列，遞迴深度為 n-1。
 */
