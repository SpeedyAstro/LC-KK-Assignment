package sorting.easy;

import java.util.Arrays;
import java.util.HashMap;

public class O6_IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : nums1) map.put(j, map.getOrDefault(j, 0) + 1);
        int k=0;
        for (int j : nums2) {
            if (map.containsKey(j) && map.get(j) > 0) {
                nums1[k++] = j;
                map.put(j, map.get(j) - 1);
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }

}
