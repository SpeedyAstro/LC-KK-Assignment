package searching.medium;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class O1_FloorAndCeilingDuplicates {
        public int[] searchRange(int[] nums, int target) {
            return new int[]{floor(nums,target),ceiling(nums,target)};
        }
        public static int ceiling(int [] nums,int target){
            int ans = -1;
            int start = 0;
            int end = nums.length-1;
            while(start<=end){
                int mid = start + (end-start) /2 ;
                if(nums[mid]==target){
                    ans = mid;
                    start = mid+1;
                }
                else if(nums[mid]>target) end = mid-1;
                else start = mid+1;
            }
            return ans;
        }
        public static int floor(int []nums,int target){
            int ans = -1 ;
            int start = 0;
            int end = nums.length-1;
            while(start<=end){
                int mid = start + (end-start) /2 ;
                if(nums[mid]==target){
                    ans = mid;
                    end = mid-1;
                }
                else if(nums[mid]>target) end = mid-1;
                else start = mid+1;
            }
            return ans;
        }
}
