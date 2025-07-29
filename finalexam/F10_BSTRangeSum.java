import java.util.*;
public class F10_BSTRangeSum {
    static class Node { int v; Node l, r; Node(int x){v=x;} }
    static int idx = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 建樹邏輯略，同樣依輸入格式實作
        Node root = buildBST(sc);
        int L = sc.nextInt(), R = sc.nextInt();
        System.out.println(rangeSum(root, L, R));
    }
    static int rangeSum(Node node, int L, int R) {
        if (node == null) return 0;
        if (node.v < L) return rangeSum(node.r, L, R);
        if (node.v > R) return rangeSum(node.l, L, R);
        return node.v + rangeSum(node.l, L, R) + rangeSum(node.r, L, R);
    }
    static Node buildBST(Scanner sc) { /* … */ return null; }
}
