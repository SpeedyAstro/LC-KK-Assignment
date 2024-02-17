package sorting.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class O29_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        while(i < j){
            if(nums[i] + nums[j] == target) return new int[]{i, j};
            else if(nums[i] + nums[j] < target) i++;
            else j--;
        }
        return new int[]{-1, -1};
    }
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n ; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement),i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
