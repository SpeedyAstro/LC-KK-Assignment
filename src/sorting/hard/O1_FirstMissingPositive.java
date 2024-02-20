package sorting.hard;

public class O1_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums);
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]) swap(nums,i,correct);
            else i++;
        }
        for(int j = 0 ; j < nums.length ; j++){
            if( nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length + 1;
    }
    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
