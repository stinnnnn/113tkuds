import java.util.*;
public class F12_TreeDiameter {
    static class Node { int v; Node l, r; Node(int x){v=x;} }
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildTree(sc);
        height(root);
        System.out.println(ans);
    }
    static int height(Node u) {
        if (u == null) return 0;
        int lh = height(u.l), rh = height(u.r);
        ans = Math.max(ans, lh + rh);
        return Math.max(lh, rh) + 1;
    }
    static Node buildTree(Scanner sc) { /* … */ return null; }
}
