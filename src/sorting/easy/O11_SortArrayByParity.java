package sorting.easy;

public class O11_SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length-1;
        while(i<j){
            if(nums[i]%2 > nums[j]%2){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[i]%2 == 0) i++;
            if(nums[j]%2 == 1) j--;
        }
        return nums;
    }
    public int[] sortArrayByParity1(int[] nums) {
        int  j = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2==0 && nums[j]%2!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            if(nums[j]%2==0) j++;
        }
        return nums;
    }
}
