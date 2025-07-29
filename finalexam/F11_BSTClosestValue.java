import java.util.*;
public class F11_BSTClosestValue {
    static class Node { int v; Node l, r; Node(int x){v=x;} }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildBST(sc);
        int T = sc.nextInt();
        System.out.println(closest(root, T));
    }
    static int closest(Node node, int T) {
        int res = node.v;
        while (node != null) {
            if (Math.abs(node.v - T) < Math.abs(res - T) ||
                (Math.abs(node.v - T) == Math.abs(res - T) && node.v < res)) {
                res = node.v;
            }
            node = (T < node.v ? node.l : node.r);
        }
        return res;
    }
    static Node buildBST(Scanner sc) { /* … */ return null; }
}
