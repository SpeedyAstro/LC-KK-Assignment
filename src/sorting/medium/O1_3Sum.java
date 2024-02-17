package sorting.medium;

import java.util.*;
public class O1_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target = -nums[i];
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum==target){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}
