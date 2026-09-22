// Last updated: 22/09/2026, 09:20:02
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // Base cases: root is null (not found) or root matches the value (found)
        if (root == null || root.val == val) {
            return root;
        }
        
        // If the target value is smaller, search the left subtree
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        
        // If the target value is larger, search the right subtree
        return searchBST(root.right, val);
    }
}
