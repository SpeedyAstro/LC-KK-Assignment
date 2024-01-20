package searching.easy;

public class O9_SearchInsert {
        public int searchInsert(int[] nums, int target) {
            int start = 0 , end = nums.length-1;
            int mid = start + (end - start)/2;
            while (start<=end){
                if (target == nums[mid]){
                    return mid;
                } else if (target < nums[mid]) {
                    end = mid-1;
                }else {
                    start = mid +1 ;
                }
                mid = start + (end -start) /2;
            }
            return start;
        }
}
