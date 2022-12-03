package LeetCode.lceasy;


import Bean.TreeNode;

/**
 * @author Dale
 * @create 2022-11-27 13:32
 * @description
 */
public class Test2236 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        boolean res = checkTree(root);
        System.out.println(res);
    }
    public static boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
