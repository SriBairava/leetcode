// Last updated: 20/07/2026, 11:11:51
class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        } 
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}