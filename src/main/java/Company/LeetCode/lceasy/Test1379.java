package Company.LeetCode.lceasy;

import Bean.TreeNode;

/**
 * @Author Dale
 * @Date 2023/3/27 12:36
 * @Description
 */
public class Test1379 {
    public static void main(String[] args) {

    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == target) {
            return cloned;
        }
        TreeNode ans = null;
        if (original.left != null) {
            ans = this.getTargetCopy(original.left, cloned.left, target);
        }
        if (ans == null && original.right != null) {
            return this.getTargetCopy(original.right, cloned.right, target);
        }
        return ans;
    }
}
