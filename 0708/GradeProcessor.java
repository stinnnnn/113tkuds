public class GradeProcessor {
    public static void main(String[] args) {
        int[] scores = {78, 85, 92, 67, 88, 95, 73, 90};
        
        int sum = 0;
        for (int s : scores) sum += s;
        double avg = sum / (double) scores.length;
        
        System.out.printf("總分: %d%n", sum);
        System.out.printf("平均分數: %.2f%n", avg);
        
        int max = scores[0], min = scores[0];
        int maxIdx = 0, minIdx = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxIdx = i;
            }
            if (scores[i] < min) {
                min = scores[i];
                minIdx = i;
            }
        }
        System.out.println("最高分: " + max + " (索引 " + maxIdx + ")");
        System.out.println("最低分: " + min + " (索引 " + minIdx + ")");
        
        int countAbove = 0;
        for (int s : scores) {
            if (s > avg) countAbove++;
        }
        System.out.println("超過平均分人數: " + countAbove);
        
        System.out.println("學生編號: 成績");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + ": " + scores[i]);
        }
    }
}