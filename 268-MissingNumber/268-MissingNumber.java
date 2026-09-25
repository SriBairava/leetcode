// Last updated: 25/09/2026, 07:42:28
1import java.util.*;
2
3class Solution {
4    public int[] intersect(int[] nums1, int[] nums2) {
5        Arrays.sort(nums1);
6        Arrays.sort(nums2);
7
8        int i = 0, j = 0, k = 0;
9        while (i < nums1.length && j < nums2.length) {
10            if (nums1[i] == nums2[j]) {
11                nums1[k++] = nums1[i];
12                i++;
13                j++;
14            } else if (nums1[i] < nums2[j]) {
15                i++;
16            } else {
17                j++;
18            }
19        }
20        return Arrays.copyOfRange(nums1, 0, k);
21    }
22}