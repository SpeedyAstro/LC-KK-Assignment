package searching.medium;

public class O3_SearchRotatedArray {
    public int search(int[] nums, int target) {
        int peak = findPeak(nums);
        if (peak==-1) return binarySearch(nums,0,nums.length-1,target);
        else if (nums[peak] == target) return peak;
        else if (nums[0]<=target) return binarySearch(nums,0,peak-1,target);
        return binarySearch(nums,peak+1,nums.length-1,target);
    }
    public static int findPeak(int[] nums){
        int start = 0 , end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (mid<nums.length-1 && nums[mid]>nums[mid+1]) return mid;
            else if (mid>0 && nums[mid-1]>nums[mid]) return mid-1;
            if (nums[start]>=nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
    public static int binarySearch(int[] nums,int start, int end, int target){
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid]>target) end = mid - 1;
            else start = mid +1 ;
        }
        return  -1;
    }
}
