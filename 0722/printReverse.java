// 檔名：printReverse.java
public class printReverse {
    /**
     * 反向列印鏈結串列的所有元素
     *
     * @param head 鏈結串列的頭節點
     */
    public static void printReverse(ListNode head) {
        if (head == null) {
            return;
        }
        // 先遞迴到串列尾端
        printReverse(head.next);
        // 再從尾端往回列印
        System.out.print(head.val + " ");
    }

    // 鏈結串列節點定義
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // 建立測試用鏈結串列：1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next       = new ListNode(2);
        head.next.next  = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // 反向列印，預期輸出：5 4 3 2 1 
        printReverse(head);
    }
}

/*
 * Time Complexity: O(n)
 *   – 每個節點會被訪問一次，遞迴深度為 n。
 */
