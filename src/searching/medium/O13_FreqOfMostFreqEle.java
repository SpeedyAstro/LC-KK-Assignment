package searching.medium;

import java.util.Arrays;

public class O13_FreqOfMostFreqEle {
        public int maxFrequency(int[] nums, int k) {
            Arrays.sort(nums);
            int frequency = 0;
            long[] prefixSum = new long[nums.length];
            prefixSum[0] = nums[0];
            for(int i=1;i<nums.length;i++){
                prefixSum[i] = prefixSum[i-1] + nums[i];
            }
            for (int i = 0 ; i < nums.length ; i++) {
                frequency = Math.max(frequency, binarySearch(nums, prefixSum, i, k));
            }
            return frequency;
        }

    private int binarySearch(int[] nums, long[] prefixSum, int i, int k) {
            int start = 0 , end = i, maxFreq = 0;
            while(start<=end){
                int mid = start + (end - start) /2;
                long currSum = prefixSum[i] - prefixSum[mid] + nums[mid];
                long windowSum = (long) nums[i] * (i - mid + 1);
                if(windowSum - currSum > k)
                    start = mid + 1;
                else {
                    maxFreq = Math.max(maxFreq,i-mid+1);
                    end = mid - 1;
                }
            }
            return maxFreq;
    }
}
// Second approach
class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long n = nums.length;
        long result = 0;
        int l = 0;
        long currSum = 0;
        for(int i = 0 ; i < n ; i++){
            long target = nums[i];
            currSum += nums[i];
            while((i-l+1)* target - currSum > k){
                currSum -= nums[l];
                l++;
            }
            result = Math.max(result, i-l+1);
        }
        return (int)result;
    }
}