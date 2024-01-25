package searching.medium;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class O5_FindMinimumInRotatedArray {
        public int findMin(int[] nums) {
            if(nums.length==1) return nums[0];
            int start = 0 , end = nums.length-1;
            if(nums[start]<nums[end]) return nums[start];
            while (start<=end){
                int mid = start + (end - start) / 2;
                if (mid<nums.length-1 && nums[mid]>nums[mid+1]) return nums[mid+1];
                else if (mid>0 && nums[mid-1]>nums[mid]) return nums[mid];
                if (nums[start]>=nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
            return -1;
        }
}
