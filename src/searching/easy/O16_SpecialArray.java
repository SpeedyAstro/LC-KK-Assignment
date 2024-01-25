package searching.easy;
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/

public class O16_SpecialArray {
        public int specialArray(int[] nums) {
            int start = 0;
            int count = 0;
            int end = findMax(nums);
            int mid = 0;
            while(start <= end){
                mid = start + (end - start)/2;
                count = findCount(nums, mid);
                if(mid == count){
                    return mid;
                }
                else if(mid < count){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }

            }
            return -1;
        }
        public int findMax(int nums[]){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++){
                max = Math.max(max,nums[i]);
            }
            return max;
        }
        public int findCount(int nums[], int find){
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] >= find){
                    count++;
                }
            }
            return count;
        }
}
