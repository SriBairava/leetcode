// Last updated: 20/07/2026, 11:10:27
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        for (int num:nums1){
            set.add(num);
        }  
        for(int num: nums2){
            if(set.contains(num)){
                lst.add(num);
                set.remove(num);
            }
        }
        int[] result = new int[lst.size()];
        for(int i = 0;i<lst.size();i++){
            result[i] = lst.get(i);
        }
        return result;
    }
}