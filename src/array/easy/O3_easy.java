package array.easy;
//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class O3_easy {
    public int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        System.gc();
        return nums;
    }
}
