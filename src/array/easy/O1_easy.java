package array;
// https://leetcode.com/problems/build-array-from-permutation/
public class O1_easy {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
