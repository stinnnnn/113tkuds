// 檔名：inOrder.java
public class inOrder {
    /**
     * 中序走訪二元樹（左 -> 根 -> 右）
     *
     * @param root 樹的根節點
     */
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        // 遞迴走訪左子樹
        inOrder(root.left);
        // 訪問根節點
        System.out.print(root.val + " ");
        // 遞迴走訪右子樹
        inOrder(root.right);
    }

    // 樹節點定義
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // 建立測試用二元樹
        //       4
        //      / \
        //     2   6
        //    / \ / \
        //   1  3 5  7
        TreeNode root = new TreeNode(4);
        root.left  = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left   = new TreeNode(1);
        root.left.right  = new TreeNode(3);
        root.right.left  = new TreeNode(5);
        root.right.right = new TreeNode(7);

        // 執行中序走訪，預期輸出：1 2 3 4 5 6 7 
        inOrder(root);
    }
}

/*
 * Time Complexity: O(n)
 *   – 每個節點恰好被訪問一次，共 n 個節點。
 */
