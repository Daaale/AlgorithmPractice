package LeetCode.lcmedium.test1000;

import Bean.ListNode;

/**
 * @author Dale
 * @create 2023-03-15 18:35
 * @description
 */
public class Test0237 {
    public static void main(String[] args) {
        ListNode root = new ListNode(4);
        root.next = new ListNode(5);
        root.next.next = new ListNode(1);
        root.next.next.next = new ListNode(9);
        deleteNode(root.next);
        System.out.println(111);
    }
    public static void deleteNode(ListNode node) {
        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}
