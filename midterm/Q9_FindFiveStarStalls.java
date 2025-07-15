import java.util.*;
public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) if (scores[i] == 5) res.add(i);
        if (res.isEmpty()) System.out.println("None");
        else res.forEach(i -> System.out.print(i + " "));
    }
}
