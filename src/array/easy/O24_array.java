package array.easy;

public class O24_array {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            currSum += nums[i];
            maxSum = Math.max(currSum , maxSum);
            if(currSum<0) currSum = 0;
        }
        return maxSum;
    }
}
