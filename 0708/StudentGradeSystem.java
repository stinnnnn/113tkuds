public class StudentGradeSystem {
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};

        int sum = 0;
        for (int s : scores) sum += s;
        double avg = sum / (double) scores.length;

        int countA = 0, countB = 0, countC = 0, countD = 0;
        int max = scores[0], min = scores[0], maxIdx = 0, minIdx = 0;
        for (int i = 0; i < scores.length; i++) {
            int s = scores[i];
            char g = getGrade(s);
            switch (g) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }
            if (s > max) {
                max = s; maxIdx = i;
            }
            if (s < min) {
                min = s; minIdx = i;
            }
        }

        int aboveCount = 0;
        for (int s : scores) {
            if (s > avg) aboveCount++;
        }
        double aboveRatio = aboveCount * 100.0 / scores.length;

        System.out.println("========== 成績報告 ==========");
        System.out.printf("總平均: %.2f%n", avg);
        System.out.printf("A 級人數: %d   B 級人數: %d%n", countA, countB);
        System.out.printf("C 級人數: %d   D 級人數: %d%n", countC, countD);
        System.out.printf("最高分: 第 %d 位，分數 %d%n", maxIdx, max);
        System.out.printf("最低分: 第 %d 位，分數 %d%n", minIdx, min);
        System.out.printf("高於平均分比例: %.2f%%%n", aboveRatio);
        System.out.println("-------------------------------");
        System.out.println("學生編號\t分數\t等級");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t\t%d\t%c%n", i, scores[i], getGrade(scores[i]));
        }
    }
}

