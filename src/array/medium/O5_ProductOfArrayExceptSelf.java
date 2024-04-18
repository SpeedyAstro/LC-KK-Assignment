package array.medium;

import java.util.Arrays;

public class O5_ProductOfArrayExceptSelf {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int [] res = new int[n];
            int [] left = new int[n];
            int [] right = new int[n];
            left[0] = 1;
            right[n-1] = 1;
            for(int i = 1; i < n; i++){
                left[i] = left[i-1] * nums[i-1];
            }
            for(int i = n-2; i >= 0; i--){
                right[i] = right[i+1] * nums[i+1];
            }
            for(int i = 0; i < n; i++){
                res[i] = left[i] * right[i];
            }
            return res;
        }

    public static void main(String[] args) {
        int [] nums = {2,2,3,4};
        O5_ProductOfArrayExceptSelf obj = new O5_ProductOfArrayExceptSelf();
        int [] res = obj.productExceptSelf(nums);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
