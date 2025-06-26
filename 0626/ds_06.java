import java.util.Arrays;
import java.util.Random; 

public class ds_06 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();         
        int max = Integer.MIN_VALUE;         

        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;  
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("產生的隨機陣列：" + Arrays.toString(numbers));
        System.out.println("最大值為：" + max);
    }
}
