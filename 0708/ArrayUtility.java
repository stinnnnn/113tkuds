public class ArrayUtility {
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int tmp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = tmp;
        }
    }

    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int findSecondLargest(int[] array) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : array) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n < max) {
                second = n;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        System.out.print("原始陣列: ");
        printArray(arr);

        reverseArray(arr);
        System.out.print("反轉後陣列: ");
        printArray(arr);

        reverseArray(arr);

        int[] copied = copyArray(arr);
        System.out.print("複製陣列: ");
        printArray(copied);

        int second = findSecondLargest(arr);
        System.out.println("第二大數值: " + second);
    }
}
