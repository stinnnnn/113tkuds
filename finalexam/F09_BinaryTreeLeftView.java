import java.util.*;
public class F09_BinaryTreeLeftView {
    static class Node { int v; Node l, r; Node(int v){this.v=v;} }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Node> nodes = new ArrayList<>();
        while (sc.hasNextInt()) {
            nodes.add(sc.nextInt() == -1 ? null : new Node(sc.nextInt()));
        }
        // 層序建立略，視輸入格式調整
        // 這裡假設 input 為：n 其後 n 個值（-1 表 null）
        // 建樹邏輯請依實際題意實作
        // BFS left view
        Queue<Node> q = new ArrayDeque<>();
        q.add(nodes.get(0));
        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                Node cur = q.poll();
                if (i == 0) ans.add(cur.v);
                if (cur.l != null) q.add(cur.l);
                if (cur.r != null) q.add(cur.r);
            }
        }
        System.out.print("LeftView:");
        for (int x : ans) System.out.print(" " + x);
    }
}
