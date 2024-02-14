package sorting.easy;

public class O12_SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int even = 0, odd = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2 == 0){
                res[even] = nums[i];
                even+=2;
            }
            else{
                res[odd] = nums[i];
                odd+=2;
            }
        }
        return res;
    }
    public int[] sortArrayByParityI(int[] nums) {
        int  i =0 ,j = nums.length-1 ;
        while(i<nums.length && j>=0){
            if(nums[i]%2 > nums[j]%2){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[i]%2 == 0) i+=2;
            if(nums[j]%2 == 1) j-=2;
        }
        return nums;
    }
}
