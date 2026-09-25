// Last updated: 25/09/2026, 08:05:01
1public class Solution {
2    Integer prev = null;
3    int count = 1;
4    int max = 0;
5    public int[] findMode(TreeNode root) {
6        if (root == null) return new int[0];
7        
8        List<Integer> list = new ArrayList<>();
9        traverse(root, list);
10        
11        int[] res = new int[list.size()];
12        for (int i = 0; i < list.size(); ++i) res[i] = list.get(i);
13        return res;
14    }
15    
16    private void traverse(TreeNode root, List<Integer> list) {
17        if (root == null) return;
18        traverse(root.left, list);
19        if (prev != null) {
20            if (root.val == prev)
21                count++;
22            else
23                count = 1;
24        }
25        if (count > max) {
26            max = count;
27            list.clear();
28            list.add(root.val);
29        } else if (count == max) {
30            list.add(root.val);
31        }
32        prev = root.val;
33        traverse(root.right, list);
34    }
35}