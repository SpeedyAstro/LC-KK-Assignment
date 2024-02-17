package sorting.easy;

import java.util.ArrayList;
import java.util.List;

public class O27_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]<= nums.length && nums[i]!=nums[correct] ) swap(nums,i,correct);
            else i++;
        }
        // System.out.println(Arrays.toString(nums));
        for(int j = 0 ; j < nums.length;j++){
            // System.out.println(nums[j] +" : "+(j+1));
            if(nums[j]!=j+1) list.add(j+1);
        }
        return list;
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
