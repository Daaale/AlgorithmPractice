package LeetCode.daily;

import Bean.TreeNode;

/**
 * @Author Dale
 * @Date 2023/2/6 23:07
 * @Description
 */
public class Test2331 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        boolean res = evaluateTree(root);
        System.out.println(res);
    }
    public static boolean evaluateTree(TreeNode root) {
        if (root.val == 0) {
            return false;
        } else if (root.val == 1) {
            return true;
        } else if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }

    }
}
