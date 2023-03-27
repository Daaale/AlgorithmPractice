package LeetCode.lceasy;

import Bean.TreeNode;

/**
 * @Author Dale
 * @Date 2023/3/27 12:36
 * @Description
 */
public class Test1379 {
    public static void main(String[] args) {

    }
    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == target) {
            return target;
        } else {
            if (original.left != null) {
                return getTargetCopy(original.left, cloned.left, target);
            }
            if (original.right != null) {
                return getTargetCopy(original.right, cloned.right, target);
            }
        }
        return null;
    }
}
