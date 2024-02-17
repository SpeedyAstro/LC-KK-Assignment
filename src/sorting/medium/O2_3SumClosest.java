package sorting.medium;

import java.util.Arrays;
import java.util.Map;

public class O2_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target) return sum;
                if(Math.abs(sum-target) < Math.abs(closest-target)){
                    closest = sum;
                }
                if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closest;
    }
}
