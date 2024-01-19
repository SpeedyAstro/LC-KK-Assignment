package array.medium;

public class O8_RotateArray {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k %= n;
            if(k<0){
                k += n;
            }
            rotateMe(nums, 0, n - k);
            rotateMe(nums, n - k, nums.length);
            rotateMe(nums, 0, nums.length);
        }
        public static void rotateMe(int [] nums, int start , int end){
            int temp;
            while (start<end){
                temp = nums[end-1];
                nums[end-1] = nums[start];
                nums[start] = temp;
                start++;
                end--;
            }

        }
}
