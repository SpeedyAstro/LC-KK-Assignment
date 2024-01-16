package array.medium;

import java.util.Arrays;

public class O5_ProductOfArrayExceptSelf {
        public int[] productExceptSelf(int[] nums) {
            System.out.println(Arrays.toString(nums));
            int len = nums.length;
            int [] left = new int[len];
            int [] right = new int[len];

            int leftProd = 1;
            for(int i = 0; i < len; i++){
                left[i] = leftProd;
                leftProd *= nums[i];
            }
            System.out.println(Arrays.toString(left));

            int rightProd = 1;
            for(int i = len - 1; i >= 0; i--){
                right[i] = rightProd;
                rightProd *= nums[i];
            }
            System.out.println(Arrays.toString(right));
            for (int i = 0; i < len; i++){
                nums[i] = left[i] * right[i];
            }

            return nums;


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
