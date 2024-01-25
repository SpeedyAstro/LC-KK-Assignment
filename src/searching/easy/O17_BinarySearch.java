package searching.easy;

public class O17_BinarySearch {
        public int search(int[] nums, int target) {
            int hi = nums.length - 1;
            int lo = 0;

            while(lo <= hi) {
                int mid = (lo + hi) / 2;
                if(nums[mid] == target) {
                    return mid;
                } else if(nums[mid] > target) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            return -1;
        }
}
