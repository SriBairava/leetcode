// Last updated: 20/07/2026, 11:11:50
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (root.left == null && root.right == null){
            return 1 - Math.max(leftDepth,rightDepth);
        }
        if(root.left == null ){
            return 1 + rightDepth;
        }
        if(root.right == null){
            return 1 + leftDepth;
        }

        return Math.min(leftDepth, rightDepth) + 1;
    }
}