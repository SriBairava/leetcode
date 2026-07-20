// Last updated: 20/07/2026, 11:11:49
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        if (root.left == null && root.right==null){
            return targetSum - root.val == 0;
        }
        targetSum -= root.val;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}