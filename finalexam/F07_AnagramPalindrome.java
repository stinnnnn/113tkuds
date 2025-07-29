import java.util.*;
public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                cnt[Character.toLowerCase(c) - 'a']++;
            }
        }
        int odd = 0;
        for (int x : cnt) if (x % 2 != 0) odd++;
        System.out.println(odd <= 1 ? "Possible" : "Impossible");
    }
}
