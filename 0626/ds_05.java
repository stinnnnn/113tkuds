public class ds_05 {
    public static void main(String[] args) {
       
        int[] numbers = {5, 8, 12, 3, 7, 14, 6, 9, 10, 11};

        int sum = 0;

       
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("陣列所有元素的總和為：" + sum);
    }
}
