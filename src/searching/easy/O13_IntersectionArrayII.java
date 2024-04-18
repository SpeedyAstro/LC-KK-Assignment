package searching.easy;

import java.util.Arrays;
import java.util.HashMap;

public class O13_IntersectionArrayII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                nums1[k++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        int k=0;
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                nums1[k++] = nums2[i];
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
