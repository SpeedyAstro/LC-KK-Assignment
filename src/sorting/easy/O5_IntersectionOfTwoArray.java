package sorting.easy;

import java.util.HashSet;

public class O5_IntersectionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums1){
            set.add(ele);
        }
        HashSet<Integer> intersect = new HashSet<>();
        for(int ele : nums2){
            if(set.contains(ele)){
                intersect.add(ele);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for(int ele : intersect){
            result[i++] = ele;
        }
        return result;
    }
}
